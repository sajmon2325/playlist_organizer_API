package com.opensourcedev.playlist_organizer_API.domain_model;

import org.springframework.context.annotation.Profile;

@Profile("test")
public enum Rating {

    STANDARD, GOOD, AWESOME, EPIC, LEGENDARY
}
