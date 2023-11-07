package org.lessons.java.bestOfTheYear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {
    //Index
    @GetMapping
    @ResponseBody
    public String index(){
        return "Ciao ciao, sono la index!";
    }

    // Homepage
    @GetMapping("home")
    public String getName(Model model){
        String name = "Giovanni";
        model.addAttribute("myName", name);
        return "home-page";
    }

    private List<String> getBestMovies() {
        List<String> bestMovies = new ArrayList<>();
    }
}
