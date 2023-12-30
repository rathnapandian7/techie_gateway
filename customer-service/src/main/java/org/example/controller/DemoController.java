package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cont")
public class DemoController {

    @GetMapping("/getString")
    public String getString() {

        return "success";
    }


}
