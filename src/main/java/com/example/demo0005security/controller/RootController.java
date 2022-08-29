package com.example.demo0005security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RootController {

    @GetMapping(value={"/", "/index"})
    @ResponseBody
    public String root()
    {
        return "root";
    }

}
