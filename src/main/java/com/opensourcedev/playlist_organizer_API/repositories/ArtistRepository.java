package com.opensourcedev.playlist_organizer_API.repositories;

import com.opensourcedev.playlist_organizer_API.domain_model.Artist;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Profile("test")
@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long> {

    Artist findByArtistName(String artistName);


}
