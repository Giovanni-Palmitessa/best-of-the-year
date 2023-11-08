package org.lessons.java.bestOfTheYear.controller;

import org.lessons.java.bestOfTheYear.model.Movie;
import org.lessons.java.bestOfTheYear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
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
    private List<Movie> getBestMovies() {
        Movie[] bestMoviesArray = {new Movie(1, "Avengers: Endgame"), new Movie(2, "Avengers: Infinity War"), new Movie(3, "Avengers")};
        return Arrays.asList(bestMoviesArray);
    }

    // get Songs
    private List<Song> getBestSongs() {
        Song[] bestSongsArray = {new Song(4, "Bad Bunny - La Jumpa"), new Song(5, "Rick Astley - Never Gonna Give You Up"), new Song(6, "Bello Figo Gu - Pasta con tonno")};
        return Arrays.asList(bestSongsArray);
    }

    // movies.html
    @GetMapping("movies")
    public String movies(Model model){
        List<Movie> bestMoviesArray = getBestMovies();
        model.addAttribute("getBestMovies", bestMoviesArray);
        return "movies";
    }

    // songs
    @GetMapping("songs")
    public String songs(Model model){
        List<Song> bestSongsArray = getBestSongs();
        model.addAttribute("getBestSongs", bestSongsArray);
        return "songs";
    }
}
