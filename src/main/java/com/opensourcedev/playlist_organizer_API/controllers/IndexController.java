package com.opensourcedev.playlist_organizer_API.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        sb.append("[1] To display the default page and manual: \"/index\" or \"/\"");

        log.debug("[+]Index Controller has been called...");
        return sb.toString();
    }
}
