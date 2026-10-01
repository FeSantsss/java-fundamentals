package dev.felipysantsss.springStudy.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/hello")
public class HelloController {

    @GetMapping(value = "/{name}")
    @ResponseStatus(HttpStatus.OK)
    public String get(@PathVariable(value = "name") String name){
        return "Hello, " + name + "!";
    }

    @GetMapping("/novo")
    @ResponseStatus(HttpStatus.OK)
    public String get2(){
        return "Hello, World!";
    }
}
