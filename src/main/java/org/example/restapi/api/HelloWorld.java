package org.example.restapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HelloWorld {

    @GetMapping("/")
    public String home() {
        return "Helloworld";
    }
}
