package com.springpractice.jokesapp.services;

import com.springpractice.jokesapp.services.interfaces.ServiceJokes;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by sousaJ on 26/08/2020
 * in package - com.springpractice.jokesapp.services
 **/
@Service
public class ServiceJokesImpl implements ServiceJokes {

    @Override
    public String getRandomJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
