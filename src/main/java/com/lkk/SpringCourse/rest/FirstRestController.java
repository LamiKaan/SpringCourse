package com.lkk.SpringCourse.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
    @Value("${welcome_text}")
    private String welcomeMessage;

    // Expose "/" to return "Hello World"
    @GetMapping(path = {"/"})
    public String printWelcomeMessage() {
        return welcomeMessage;
    }

    // Expose a new endpoint "/friends"
    @GetMapping(path = {"/friends"})
    public String listFriends() {
        return "0 friends";
    }
}
