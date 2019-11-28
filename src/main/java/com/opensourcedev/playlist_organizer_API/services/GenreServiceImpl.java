package com.opensourcedev.playlist_organizer_API.services;

import com.opensourcedev.playlist_organizer_API.domain_model.Genre;
import com.opensourcedev.playlist_organizer_API.repositories.GenreRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class GenreServiceImpl implements GenreService{

    GenreRepository genreRepository;

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
    public Set<Genre> findGenresByArtist(Long id) {
        Set<Genre> genres = new HashSet<>();
        genreRepository.findGenresByArtist(id).forEach(genres::add);
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
