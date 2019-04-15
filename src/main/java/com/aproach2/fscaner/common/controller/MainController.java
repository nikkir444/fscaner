package com.aproach2.fscaner.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/main")
public class MainController {



    @GetMapping(value = "/lines")
    public String getConsumerFile() {
        return "Controller check";
    }

}
