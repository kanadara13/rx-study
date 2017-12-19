package com.rx.study.controller;

import com.rx.study.service.RunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunController {

    @Autowired
    RunService runService;

    @GetMapping("/run")
    public String run(){
        runService.run();
        return "done";
    }
}
