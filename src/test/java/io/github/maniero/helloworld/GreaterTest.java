package io.github.maniero.helloworld;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreaterTest {
    @DisplayName("It says hello to the world")
    @Test
    void testGreaterSay() {
        assertEquals("Hello, World!", new Greater().sayHello("World"));
    }
}
