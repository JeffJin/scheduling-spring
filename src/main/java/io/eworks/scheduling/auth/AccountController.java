package io.eworks.scheduling.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @PostMapping("/validate")
    public String index() {
        return "AccountController.ValidateToken";
    }

}

