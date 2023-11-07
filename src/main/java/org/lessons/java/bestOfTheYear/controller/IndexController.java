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

    // get Movies
    private List<String> getBestMovies() {
        List<String> bestMovies = new ArrayList<>();
        bestMovies.add("Avengers: Endgame");
        bestMovies.add("Avengers: Infinity War");
        bestMovies.add("Avengers");
        return bestMovies;
    }

    // get Songs
    private List<String> getBestSongs() {
        List<String> bestSongs = new ArrayList<>();
        bestSongs.add("Bad Bunny - La Jumpa");
        bestSongs.add("Rick Astley - Never Gonna Give You Up");
        bestSongs.add("Bello Figo Gu - Pasta con tonno");
        return bestSongs;
    }

    // movies.html
    @GetMapping("movies")
    public String movies(Model model){
        List<String> bestMovies = getBestMovies();
        String moviesString = String.join(", ", bestMovies );
        model.addAttribute("getBestMovies", moviesString);
        return "movies";
    }

    // songs
    @GetMapping("songs")
    public String songs(Model model){
        List<String> bestSongs = getBestSongs();
        String songsString = String.join(", ", bestSongs );
        model.addAttribute("getBestSongs", songsString);
        return "songs";
    }
}
