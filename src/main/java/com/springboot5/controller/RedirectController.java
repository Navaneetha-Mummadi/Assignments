package com.springboot5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/example")
public class RedirectController {

    @GetMapping("/test")
    public String redirect() {
        return "redirect:/example/test2";
    }

    @GetMapping("/test2")
    @ResponseBody
    public String redirected() {
        return "You have been redirected to /example/test2";
    }
}
