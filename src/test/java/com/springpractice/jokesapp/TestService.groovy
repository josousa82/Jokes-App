package com.springpractice.jokesapp

import com.springpractice.jokesapp.services.ServiceJokesImpl
import com.springpractice.jokesapp.services.interfaces.ServiceJokes
import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class TestService extends Specification{

    ServiceJokes serviceJokes
    ChuckNorrisQuotes chuckNorrisQuotes

    def setup(){
        serviceJokes = Mock()
        chuckNorrisQuotes = Mock()
    }

    def "when getJoke method is called a random string is returned"() {

        given:
        def joke = "Bill Gates thinks he's Chuck Norris. Chuck Norris actually laughed. Once."
        chuckNorrisQuotes.getRandomQuote() >> joke

        when:
        serviceJokes.getRandomJoke() >> joke

        then:
        serviceJokes.getRandomJoke() == joke

    }

}
