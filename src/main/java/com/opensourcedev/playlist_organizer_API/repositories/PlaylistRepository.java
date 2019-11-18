package com.opensourcedev.playlist_organizer_API.repositories;

import com.opensourcedev.playlist_organizer_API.domain_model.Playlist;
import com.opensourcedev.playlist_organizer_API.domain_model.Rating;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Profile("test")
@Repository
public interface PlaylistRepository extends CrudRepository<Playlist, Long> {

    Playlist findByPlaylistName(String playlistName);
    Playlist findByRating(Rating rating);

}
