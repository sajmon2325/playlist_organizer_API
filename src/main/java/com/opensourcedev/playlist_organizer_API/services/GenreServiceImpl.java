package com.opensourcedev.playlist_organizer_API.services;

import com.opensourcedev.playlist_organizer_API.domain_model.Artist;
import com.opensourcedev.playlist_organizer_API.domain_model.Genre;
import com.opensourcedev.playlist_organizer_API.repositories.ArtistRepository;
import com.opensourcedev.playlist_organizer_API.repositories.GenreRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class GenreServiceImpl implements GenreService{

    GenreRepository genreRepository;
    ArtistRepository artistRepository;

    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }



    @Override
    public Set<Genre> findAll() {
        Set<Genre> genres = new HashSet<>();
        genreRepository.findAll().forEach(genres::add);
        return genres;
    }

    @Override
    public Genre findById(Long aLong) {
        return genreRepository.findById(aLong).orElse(null);
    }

    @Override
    public Set<Genre> findGenresByArtist(Long aLong) {
        Set<Genre> genres = new HashSet<>();
        Optional<Artist> artist = artistRepository.findById(aLong);
        genreRepository.findGenresByArtist(artist.get().getId()).forEach(genres::add);
        return null;
    }

    @Override
    public Genre save(Genre object) {
        return genreRepository.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        genreRepository.deleteById(aLong);
    }

    @Override
    public void delete(Genre object) {
        genreRepository.delete(object);
    }
}
