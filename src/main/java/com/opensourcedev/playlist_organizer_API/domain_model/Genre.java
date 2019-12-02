package com.opensourcedev.playlist_organizer_API.domain_model;

import lombok.*;
import org.springframework.context.annotation.Profile;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Profile("test")
@Entity
@Table(name = "genres")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private GenreTypes genreTypes;

    @OneToMany
    @JoinColumn(name = "artist_id")
    private Set<Artist> artist = new HashSet<>();


}
