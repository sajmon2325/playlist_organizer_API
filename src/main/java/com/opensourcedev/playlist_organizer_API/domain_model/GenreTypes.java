package com.opensourcedev.playlist_organizer_API.domain_model;

import org.springframework.context.annotation.Profile;

@Profile("test")
public enum GenreTypes {

    POP, RAP, EPIC_MUSIC,
    ROCK, HARD_ROCK, FOLK_METAL, HEAVY_METAL, DEATH_METAL, MELODIC_METAL, ALTERNATIVE_METAL
}
