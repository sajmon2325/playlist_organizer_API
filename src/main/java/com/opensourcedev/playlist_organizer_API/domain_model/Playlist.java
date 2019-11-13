package com.opensourcedev.playlist_organizer_API.domain_model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Profile;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "playlists")
@Profile("test")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "playlist_name")
    private String playlist_name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "playlist")
    private Set<Track> playlist_tracks = new HashSet<>();

    @Enumerated(value = EnumType.STRING)
    private Rating rating;
}
