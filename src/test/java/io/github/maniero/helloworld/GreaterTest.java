package io.github.maniero.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreaterTest {
    @Test
    void testGreaterSay() {
        assertEquals("Hello, Maniero!", new Greater().sayHello("Maniero"));
    }
}