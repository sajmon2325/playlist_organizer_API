package com.opensourcedev.playlist_organizer_API.services;

import com.opensourcedev.playlist_organizer_API.domain_model.Playlist;
import com.opensourcedev.playlist_organizer_API.domain_model.Rating;

public interface PlaylistService extends CrudInterface<Playlist, Long> {

    Playlist findByPlaylistName(String playlistName);
    Playlist findByRating(Rating rating);
}
