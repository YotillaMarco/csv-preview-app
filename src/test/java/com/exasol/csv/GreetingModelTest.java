package com.exasol.csv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingModelTest {

    /**
     * Make sure that JUnit works...
     */
    @Test
    void testGreeting() {
        final GreetingModel greetingModel = new GreetingModel();
        assertEquals("Hello World", greetingModel.getGreeting());
    }
}