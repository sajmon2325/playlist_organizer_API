package com.opensourcedev.playlist_organizer_API.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("test")
@RestController
@Slf4j
public class IndexController {

    @GetMapping({"", "/", "index", "index.html", "/index"})
    public String index(){
        StringBuilder sb = new StringBuilder();
        sb.append("With this API you can add Artist, Genre an Tracks int your own Playlist \n");
        sb.append("and rate them. You can also sort them by your own rating of song name \n");
        sb.append("or maybe you can sort them by release year of the song or by song length :)\n");
        sb.append("\n\nThe usage of this API is simple, just write the corresponding URL listed below into browser \n");
        sb.append("or you can map the API URL to your own GUI buttons \n\n");
        sb.append("The API URLs are listed below: \n");

        sb.append("[1] To display the default page and manual: \"/index\" or \"/\" \n");
        sb.append("[2] To request all Artist: \"/artist/all\" \n");
        sb.append("[3] To find a specific Artist: \"/artist/{id}\" \n");
        sb.append("[4] To save an Artist: \"/artist/save\" \n");
        sb.append("[5] To delete an Artist by ID: \"/artist/delete/{id}\" \n");
        sb.append("[6] To find Artist by Artist Name: \"/artist/artistname/artistName\" \n\n\n");

        sb.append("[7] To request all Tracks: \"/track/all\" \n");
        sb.append("[8] To find a specific Track: \"/track/{id}\" \n");
        sb.append("[9] To save a Track: \"/track/save\" \n");
        sb.append("[10] To delete a Track by ID: \"/track/delete/{id}\" \n");
        sb.append("[11] To find Track by Track Name: \"/track/trackname/trackName\" \n\n\n");

        sb.append("[12] To request all Genres: \"/genre/all\" \n");
        sb.append("[13] To find a specific Genre: \"/genre/{id}\" \n");
        sb.append("[13] To find all Genres of a specific Artist: \"/genre/findAll/{id}\" \n");
        sb.append("[14] To save a Genre: \"/genre/save\" \n");
        sb.append("[15] To delete a Genre by his ID: \"/genre/delete/{id}\" \n\n\n");

        sb.append("[16] To request all Playlists: \"/playlist/all\" \n");
        sb.append("[17] To find Playlist by his ID: \"/playlist/{id}\" \n");
        sb.append("[18] To find Playlist by his Rating: \"/playlist/{playlistRating}\" \n");
        sb.append("[19] To find Playlist by his name: \"/playlistname/{playlistname}\" \n");
        sb.append("[20] To save a Playlist: \"/playlist/save\" \n");
        sb.append("[21] To delete Playlist by his ID: \"/delete/{id}\" \n\n\n");

        log.debug("[+]Index Controller has been called...");
        return sb.toString();
    }
}
