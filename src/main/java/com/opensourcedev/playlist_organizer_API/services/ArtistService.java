package com.opensourcedev.playlist_organizer_API.services;

import com.opensourcedev.playlist_organizer_API.domain_model.Artist;

public interface ArtistService extends CrudInterface<Artist, Long> {

    Artist findByArtistName(String artistName);

}
