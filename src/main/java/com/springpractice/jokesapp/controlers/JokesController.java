package com.springpractice.jokesapp.controlers;

import com.springpractice.jokesapp.services.ServiceJokesImpl;
import com.springpractice.jokesapp.services.interfaces.ServiceJokes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by sousaJ on 26/08/2020
 * in package - com.springpractice.jokesapp.controlers
 **/
@Controller
public class JokesController {

    private final ServiceJokes serviceJokes;

    @Autowired
    public JokesController(ServiceJokesImpl serviceJokes) {
        this.serviceJokes = serviceJokes;
    }

    @GetMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke", serviceJokes.getRandomJoke());
        return "index";
    }
}
