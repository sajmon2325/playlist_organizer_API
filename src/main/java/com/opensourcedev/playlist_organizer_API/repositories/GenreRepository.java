package com.opensourcedev.playlist_organizer_API.repositories;

import com.opensourcedev.playlist_organizer_API.domain_model.Genre;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Profile("test")
@Repository
public interface GenreRepository extends CrudRepository<Genre, Long> {

    Set<Genre> findGenresByArtist(Long aLong);
}
