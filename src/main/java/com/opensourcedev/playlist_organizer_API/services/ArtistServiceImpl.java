package com.opensourcedev.playlist_organizer_API.services;

import com.opensourcedev.playlist_organizer_API.domain_model.Artist;
import com.opensourcedev.playlist_organizer_API.domain_model.Genre;
import com.opensourcedev.playlist_organizer_API.domain_model.Track;
import com.opensourcedev.playlist_organizer_API.repositories.ArtistRepository;
import com.opensourcedev.playlist_organizer_API.repositories.GenreRepository;
import com.opensourcedev.playlist_organizer_API.repositories.TrackRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;
    private final GenreRepository genreRepository;
    private final TrackRepository trackRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository, GenreRepository genreRepository, TrackRepository trackRepository) {
        this.artistRepository = artistRepository;
        this.genreRepository = genreRepository;
        this.trackRepository = trackRepository;
    }

    @Override
    public Set<Genre> findGenresByArtist(Long id) {
        Set<Genre> genres = new HashSet<>();
        genreRepository.findGenresByArtist(id).forEach(genres::add);
        return genres;
    }

    @Override
    public Artist findByArtistName(String artistName) {
        return null;
    }

    @Override
    public Artist findByGenre(Genre genre) {
        return null;
    }

    @Override
    public Artist findByTrack(Track track) {
        return null;
    }

    @Override
    public Set<Genre> findAllGenres() {
        Set<Genre> genres = new HashSet<>();
        genreRepository.findAll().forEach(genres::add);
        return genres;
    }

    @Override
    public Set<Track> findAllTracks(Track track) {
        Set<Track> tracks = new HashSet<>();
        trackRepository.findAll().forEach(tracks::add);
        return tracks;
    }

    @Override
    public Set<Artist> findAll() {
        Set<Artist> artists = new HashSet<>();
        artistRepository.findAll().forEach(artists::add);
        return artists;
    }

    @Override
    public Artist findById(Long aLong) {
        return artistRepository.findById(aLong).orElse(null);
    }

    @Override
    public Artist save(Artist object) {
        return artistRepository.save(object);
    }

    @Override
    public void delete(Artist object) {
        artistRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        artistRepository.deleteById(aLong);
    }


}
