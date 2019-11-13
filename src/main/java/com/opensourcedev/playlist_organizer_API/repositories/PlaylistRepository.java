package com.opensourcedev.playlist_organizer_API.repositories;

import com.opensourcedev.playlist_organizer_API.domain_model.Playlist;
import com.opensourcedev.playlist_organizer_API.domain_model.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends CrudRepository<Playlist, Long> {

    Playlist findByplaylistName(String playlistName);
    Playlist findByRating(Rating rating);

}