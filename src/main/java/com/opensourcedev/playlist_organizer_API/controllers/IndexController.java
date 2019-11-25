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
        sb.append("[3] To find a specific Artist: \"/artist/id\" \n");
        sb.append("[4] To save an Artist: \"/artist/save\" \n");
        sb.append("[5] To delete an Artist by ID: \"/artist/delete/id\" \n");
        sb.append("[6] To find Artist by Artist Name: \"/artist/artistname/artistname\"");


        log.debug("[+]Index Controller has been called...");
        return sb.toString();
    }
}
