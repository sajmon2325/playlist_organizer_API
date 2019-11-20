package com.opensourcedev.playlist_organizer_API.repositories;

import com.opensourcedev.playlist_organizer_API.domain_model.Genre;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface GenreRepository extends CrudRepository<Genre, Long> {

    Set<Genre> findGenresByArtist(Long id);
}
