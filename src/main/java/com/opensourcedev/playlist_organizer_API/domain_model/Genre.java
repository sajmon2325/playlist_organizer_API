package com.opensourcedev.playlist_organizer_API.domain_model;

import lombok.*;
import org.springframework.context.annotation.Profile;

import javax.persistence.*;

@Entity
@Table(name = "genres")
@Profile("test")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private GenreTypes genreTypes;

//    @JoinColumn(name = "artist_id")
    private Artist artist;


}
