package com.opensourcedev.playlist_organizer_API.controllers;

import com.opensourcedev.playlist_organizer_API.domain_model.Track;
import com.opensourcedev.playlist_organizer_API.services.TrackService;
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
@RequestMapping({"/Track", "/track"})
public class TrackController {

    private final TrackService trackService;

    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Set<Track> showAllTracks(){
        log.debug("[+] Track Controller has been called...");
        log.debug("[+] showAllTracks() has been called...");
        return trackService.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Track findTrackById(@RequestBody @PathVariable Long id){
        log.debug("[+] Track Controller has been called...");
        log.debug("[+] findTrackById() has been called...");
        return  trackService.findById(id);
    }

    @PostMapping("/save")
    public @ResponseBody ResponseEntity saveTrack(@RequestBody Track track){
        log.debug("[+] Track Controller has been called...");
        log.debug("[+] saveTrack() has been called...");
        trackService.save(track);
        return ResponseEntity.ok(HttpStatus.OK + " Track has been successfully saved to database");
    }

    @DeleteMapping("/delete/{id}")
    public @ResponseBody ResponseEntity deleteTrackById(@RequestBody @PathVariable Long id){
        log.debug("[+] Track Controller has been called...");
        log.debug("[+] deleteTrackById() has been called...");
        trackService.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK + " Track has been successfully removed");
    }

    @GetMapping(value = "/trackname/{trackname}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Track findTrackByName(@RequestBody @PathVariable String trackname){
        log.debug("[+] Track Controller has been called...");
        log.debug("[+] findTrackByName() has been called...");
        return trackService.findByTrackName(trackname);
    }



}
