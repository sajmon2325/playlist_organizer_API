package com.opensourcedev.playlist_organizer_API.services;

import com.opensourcedev.playlist_organizer_API.domain_model.Artist;
import com.opensourcedev.playlist_organizer_API.domain_model.Genre;
import com.opensourcedev.playlist_organizer_API.domain_model.Track;

import java.util.Set;

public interface ArtistService extends CrudInterface<Artist, Long> {

    Set<Genre> findAllGenres();
    Set<Track> findAllTracks(Track track);
    Artist findByArtistName(String artistName);
    Artist findByGenre(Genre genre);
    Artist findByTrack(Track track);
    Set<Genre> findGenresByArtist(Long id);

}
