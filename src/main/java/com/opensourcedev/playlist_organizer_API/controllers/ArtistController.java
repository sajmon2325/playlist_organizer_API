package com.opensourcedev.playlist_organizer_API.controllers;

import com.opensourcedev.playlist_organizer_API.domain_model.Artist;
import com.opensourcedev.playlist_organizer_API.services.ArtistService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Profile("test")
@RestController
@Slf4j
@RequestMapping({"/Artist", "/artist"})
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Set<Artist> showAllArtists(){
        log.debug("[+]Artist Controller has been called...");
        log.debug("[+]showAllArtists() has been called...");
        return artistService.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Artist findArtistById(@RequestBody @PathVariable Long id){
        log.debug("[+]Artist Controller has been called...");
        log.debug("[+]findArtistById() has been called...");
        return artistService.findById(id);
    }

    @PostMapping("/save")
    public @ResponseBody ResponseEntity saveArtist(@RequestBody Artist artist){
        log.debug("[+]Artist Controller has been called...");
        log.debug("[+]saveArtist() has been called...");
        artistService.save(artist);
        return ResponseEntity.ok(HttpStatus.OK + " Artist has been successfully saved to database");
    }

    @DeleteMapping("/delete/{id}")
    public @ResponseBody ResponseEntity deleteArtistById(@RequestBody @PathVariable Long id){
        log.debug("[+]Artist Controller has been called...");
        log.debug("[+]deleteArtistById() has been called...");
        artistService.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK + " Artist has been successfully removed");
    }

    @GetMapping(value = "/artistname/{artistname}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Artist findArtistByName(@RequestBody @PathVariable String artistname){
        log.debug("[+]Artist Controller has been called...");
        log.debug("[+]findArtistByName() has been called...");
        return artistService.findByArtistName(artistname);
    }


}
