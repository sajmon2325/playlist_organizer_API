package com.opensourcedev.playlist_organizer_API.domain_model;

import lombok.*;
import org.springframework.context.annotation.Profile;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tracks")
@Profile("test")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "track_name")
    private String track_name;

    @Column(name = "track_format")
    private String track_format;

    @Column(name = "track_length")
    private Long track_length;

    @Column(name = "track_year")
    private int track_year;

    @JoinColumn(name = "playlist_id")
    private Playlist playlist;

    @OneToMany
    private Set<Artist> artist = new HashSet<Artist>();


}
