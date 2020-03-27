package com.nafis.lite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/image")
    public String image(){
        return "image";
    }
    
}
