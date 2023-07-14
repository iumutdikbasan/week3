package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Component
@Controller
public class WebController {

    @RequestMapping("/register")
    public ModelAndView getRegistrationPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index.html");
        return mv;
    }
    @RequestMapping("/saveuser")
    public void handle(User user) {
        System.out.println(user);
    }


}