package com.opensourcedev.playlist_organizer_API.services;

import com.opensourcedev.playlist_organizer_API.domain_model.Track;
import com.opensourcedev.playlist_organizer_API.repositories.TrackRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Profile("test")
@Service
public class TrackServiceImpl implements TrackService {

    TrackRepository trackRepository;

    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }



    @Override
    public Track findByTrackName(String trackName) {
        return trackRepository.findByTrackName(trackName);
    }

    @Override
    public Set<Track> findAll() {
        Set<Track> tracks = new HashSet<>();
        trackRepository.findAll().forEach(tracks::add);
        return tracks;
    }

    @Override
    public Track findById(Long aLong) {
        return trackRepository.findById(aLong).orElse(null);
    }

    @Override
    public Track save(Track object) {
        return trackRepository.save(object);
    }

    @Override
    public void delete(Track object) {
        trackRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        trackRepository.deleteById(aLong);
    }
}
