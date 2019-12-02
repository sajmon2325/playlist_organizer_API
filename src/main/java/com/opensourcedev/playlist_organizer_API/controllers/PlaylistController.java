package com.opensourcedev.playlist_organizer_API.controllers;

import com.opensourcedev.playlist_organizer_API.domain_model.Playlist;
import com.opensourcedev.playlist_organizer_API.domain_model.Rating;
import com.opensourcedev.playlist_organizer_API.services.PlaylistService;
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
@RequestMapping({"/Playlist", "/PlayList", "/playlist", "/playList"})
public class PlaylistController {

    private final PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Set<Playlist> showAllPlaylists(){
        log.debug("[+] Playlist Controller has been called...");
        log.debug("[+] showAllPlaylists() has been called...");
        return playlistService.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Playlist findPlaylistById(@RequestBody @PathVariable Long id){
        log.debug("[+] Playlist Controller has been called...");
        log.debug("[+] findPlaylistById() has been called...");
        return playlistService.findById(id);
    }

    @GetMapping(value = "/playlistname/{playlistname}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Playlist findPlaylistByPlaylistName(@RequestBody @PathVariable String playlistname){
        log.debug("[+] Playlist Controller has been called...");
        log.debug("[+] findPlaylistByPlaylistName() has been called...");
        return playlistService.findByPlaylistName(playlistname);
    }

    @GetMapping(value = "/playlistrating/{playlistrating}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Playlist findPlaylistByRating(@RequestBody @PathVariable Rating playlistrating){
        log.debug("[+] Playlist Controller has been called...");
        log.debug("[+] findPlaylistByRating() has been called...");
        return playlistService.findByRating(playlistrating);
    }

    @PostMapping(value = "/save")
    public @ResponseBody ResponseEntity savePlaylist(@RequestBody Playlist playlist){
        log.debug("[+] Playlist Controller has been called...");
        log.debug("[+] savePlaylist() has been called...");
        playlistService.save(playlist);
        return ResponseEntity.ok(HttpStatus.OK + " Playlist has been successfully saved to database");
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody ResponseEntity deletePlaylist(@RequestBody @PathVariable Long id){
        log.debug("[+] Playlist Controller has been called...");
        log.debug("[+] deletePlaylist() has been called...");
        playlistService.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK + " Playlist has been successfully removed");
    }
}
