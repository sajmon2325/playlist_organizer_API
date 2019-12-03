package com.opensourcedev.playlist_organizer_API.services;

import com.opensourcedev.playlist_organizer_API.domain_model.Playlist;
import com.opensourcedev.playlist_organizer_API.domain_model.Rating;
import com.opensourcedev.playlist_organizer_API.repositories.PlaylistRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Profile("test")
@Service
public class PlaylistServiceImpl implements PlaylistService {

    PlaylistRepository playlistRepository;

    public PlaylistServiceImpl(PlaylistRepository playlistRepository) {
        this.playlistRepository = playlistRepository;
    }

    @Override
    public Playlist findByPlaylistName(String playlistName) {
        return playlistRepository.findByPlaylistName(playlistName);
    }

    @Override
    public Playlist findByRating(Rating rating) {
        return playlistRepository.findByRating(rating);
    }

    @Override
    public Set<Playlist> findAll() {
        Set<Playlist> playlists = new HashSet<>();
        playlistRepository.findAll().forEach(playlists::add);
        return playlists;
    }

    @Override
    public Playlist findById(Long aLong) {
        return playlistRepository.findById(aLong).orElse(null);
    }

    @Override
    public Playlist save(Playlist object) {
        return playlistRepository.save(object);
    }

    @Override
    public void delete(Playlist object) {
        playlistRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        playlistRepository.deleteById(aLong);
    }
}
