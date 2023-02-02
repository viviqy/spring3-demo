package com.fairychar.spring3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chiyo <br>
 */
@RestController
public class HelloController {

    @GetMapping("hi")
    public String hi(){
        return "hi";
    }
}
