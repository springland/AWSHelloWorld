package com.springland365.AWSHelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam("name" ) Optional<String> name)
    {
        return "Hello " + name.orElse("");
    }


}
