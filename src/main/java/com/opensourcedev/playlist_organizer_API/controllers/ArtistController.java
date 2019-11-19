package com.opensourcedev.playlist_organizer_API.controllers;

import com.opensourcedev.playlist_organizer_API.domain_model.Artist;
import com.opensourcedev.playlist_organizer_API.services.ArtistService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/all")
    public Set<Artist> showAllArtists(){
        log.debug("[+]Artist Controller has been called...");
        log.debug("[+]showAllArtists() has been called...");
        return artistService.findAll();
    }
}
