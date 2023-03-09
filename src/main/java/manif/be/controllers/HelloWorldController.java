package manif.be.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/SGN")
    public String hello() {
        return "Shree Ganeshaya Namah!";
    }

}
