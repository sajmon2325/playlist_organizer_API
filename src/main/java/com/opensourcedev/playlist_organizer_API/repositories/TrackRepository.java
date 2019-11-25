package com.opensourcedev.playlist_organizer_API.repositories;

import com.opensourcedev.playlist_organizer_API.domain_model.Track;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Profile("test")
@Repository
public interface TrackRepository extends CrudRepository<Track, Long> {

    Track findByTrackName(String trackName);

}
