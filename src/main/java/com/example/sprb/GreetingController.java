package com.example.sprb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @GetMapping("/home")
    public ModelAndView show(){
        ModelAndView modelAndView=new ModelAndView("/list");
        return modelAndView;
    }
}
