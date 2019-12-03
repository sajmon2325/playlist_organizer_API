package com.opensourcedev.playlist_organizer_API.services;

import com.opensourcedev.playlist_organizer_API.domain_model.Artist;
import com.opensourcedev.playlist_organizer_API.repositories.ArtistRepository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Profile("test")
@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;


    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }


    @Override
    public Artist findByArtistName(String artistName) {
        return artistRepository.findByArtistName(artistName);
    }

    @Override
    public Set<Artist> findAll() {
        Set<Artist> artists = new HashSet<>();
        artistRepository.findAll().forEach(artists::add);
        return artists;
    }

    @Override
    public Artist findById(Long aLong) {
        return artistRepository.findById(aLong).orElse(null);
    }

    @Override
    public Artist save(Artist object) {
        return artistRepository.save(object);
    }

    @Override
    public void delete(Artist object) {
        artistRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        artistRepository.deleteById(aLong);
    }


}
