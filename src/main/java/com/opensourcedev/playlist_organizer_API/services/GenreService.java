package com.opensourcedev.playlist_organizer_API.services;

import com.opensourcedev.playlist_organizer_API.domain_model.Genre;

import java.util.Set;

public interface GenreService extends CrudInterface<Genre, Long> {

    Set<Genre> findGenresByArtist(Long id);
}
