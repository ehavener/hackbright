package com.javaunit3.springmvc;

import org.springframework.web.bind.annotation.RequestMapping;

public class MovieController {
    @RequestMapping("/")
    public String getIndexPage()
    {
        return "index";
    }
}
