package com.github.rising3.reactor.recipe

import org.junit.jupiter.api.Test
import reactor.core.publisher.Mono
import reactor.test.StepVerifier

class MonoBasicTest {
    @Test
    fun testHello() {
        StepVerifier.create(Mono.just("foo").log())
            .expectNext("foo")
            .verifyComplete()
    }
}