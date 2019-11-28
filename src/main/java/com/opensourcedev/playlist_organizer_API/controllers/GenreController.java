package com.opensourcedev.playlist_organizer_API.controllers;

import com.opensourcedev.playlist_organizer_API.domain_model.Genre;
import com.opensourcedev.playlist_organizer_API.services.GenreService;
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
@RequestMapping({"/Genre", "/genre"})
public class GenreController {

    private final GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Set<Genre> showAllGenres(){
        log.debug("[+] Genre Controller has been called...");
        log.debug("[+] showAllGenres() has been called...");
        return genreService.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Genre findGenreById(@RequestBody @PathVariable Long id){
        log.debug("[+] Genre Controller has been called...");
        log.debug("[+] findGenreById() has been called...");
        return genreService.findById(id);
    }

    @GetMapping(value = "/findAll/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Set<Genre> findAllGenresByArtist(@RequestBody @PathVariable Long id){
        log.debug("[+] Genre Controller has been called...");
        log.debug("[+] findAllGenresByArtist() has been called...");
        return genreService.findGenresByArtist(id);
    }

    @PostMapping(value = "/save")
    public @ResponseBody ResponseEntity saveGenre(@RequestBody Genre genre){
        log.debug("[+] Genre Controller has been called...");
        log.debug("[+] saveGenre() has been called...");
        genreService.save(genre);
        return ResponseEntity.ok(HttpStatus.OK + " Genre has been successfully saved to database");
    }

    @DeleteMapping("/delete/{id}")
    public @ResponseBody ResponseEntity deleteGenreById(@RequestBody @PathVariable Long id){
        log.debug("[+] Genre Controller has been called...");
        log.debug("[+] deleteGenreById() has been called...");
        genreService.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK + " Genre has been successfully removed");
    }
}
