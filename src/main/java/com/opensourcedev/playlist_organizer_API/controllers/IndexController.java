package com.opensourcedev.playlist_organizer_API.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class IndexController {

    @GetMapping({"", "/", "index", "index.html"})
    public String index(){
        log.debug("[+]Index Controller has been called...");
        return "index";
    }
}
