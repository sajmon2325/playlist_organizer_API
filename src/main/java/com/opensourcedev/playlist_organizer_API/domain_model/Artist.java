package com.opensourcedev.playlist_organizer_API.domain_model;

import lombok.*;
import org.springframework.context.annotation.Profile;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "artists")
@Profile("test")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "artist_name")
    private String artistName;

    @OneToMany(mappedBy = "artist")
    private List<Genre> genres = new ArrayList<Genre>();

    @OneToMany(mappedBy = "artist") //TODO create a service that will delete track only if both artists has been removed
    private Set<Track> track = new HashSet<Track>();

    @OneToMany(mappedBy = "artist")
    private Set<Genre> genre = new HashSet<Genre>();

}
