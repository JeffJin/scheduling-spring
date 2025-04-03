package io.eworks.scheduling;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}

