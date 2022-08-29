package com.example.demo0005security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping(value={"/user"})
    @ResponseBody
    public String user()
    {
        return "user";
    }
}
