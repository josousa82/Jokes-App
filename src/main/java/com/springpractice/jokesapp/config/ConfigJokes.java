package com.springpractice.jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sousaJ on 03/09/2020
 * in package - com.springpractice.jokesapp.config
 **/
//@Configuration
public class ConfigJokes {

//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

}
