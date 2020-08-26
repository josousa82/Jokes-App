package com.springpractice.jokesapp

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class TestService extends Specification{

    def "let's try this!"() {
        expect:
        Math.max(1, 2) == 3
    }

}
