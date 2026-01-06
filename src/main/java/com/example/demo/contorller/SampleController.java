package com.example.demo.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SampleController {
    @RequestMapping("/sample")
    public String sampl() {
        return "sample";
    }
}
