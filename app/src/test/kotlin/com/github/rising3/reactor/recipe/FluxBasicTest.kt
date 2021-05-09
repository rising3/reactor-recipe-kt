package com.github.rising3.reactor.recipe

import org.junit.jupiter.api.Test
import reactor.core.publisher.Flux
import reactor.test.StepVerifier

class FluxBasicTest {
    @Test
    fun testHello() {
        StepVerifier.create(Flux.just("foo", "bar", "foobar").log())
            .expectNext("foo")
            .expectNext("bar")
            .expectNext("foobar")
            .verifyComplete()
    }
}