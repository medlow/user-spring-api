package io.javabrains.springsecurityjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home() {
        return ("<h1>Bienvenue</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>Bienvenue Chers Client</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Bienvenue Admin</h1>");
    }
}

