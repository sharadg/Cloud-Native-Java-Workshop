package io.pivotal.cloudnativespring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${greeting:Hola}")
    private String greeting;

    @GetMapping("/hello")
    public String sayHello() {
        return greeting + " World!";
    }
}
