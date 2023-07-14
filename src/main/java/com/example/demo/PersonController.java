package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

//    @GetMapping("/people")
//    public Model getPeople(Model model){
//        model.addAttribute("something", "this is coming from the ");
//        return model;
//    }
    @RequestMapping (value = "index")
    public String index(){
        return "index";
    }


}

