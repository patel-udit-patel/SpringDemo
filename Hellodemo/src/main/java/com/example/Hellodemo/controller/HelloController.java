package com.example.Hellodemo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    //UC_01
    //GET Request - Responds with "Hello from BridgeLabz"
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
    //UC_02 (MVC - Thymeleaf)
    @GetMapping("/UC2")
    public String sayHelloUC2(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz");
        //This must match a Thymeleaf template (hello.html)
        return "hello";

    }

    //UC_03(Rest Request)
    @GetMapping("/UC3")
    public String sayHelloByRestCall() {
        return "Hello from BridgeLabz";
    }

    //UC_04
    @GetMapping("/UC4")
    public String sayHelloUsingVSCode() {
        return "Hello from BridgeLabz Using STS";
    }
}
