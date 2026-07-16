package com.example.junitadvancedtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {

    @Test
    void testException() {

        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> {
                    new ExceptionThrower().throwException();
                });

        assertEquals("Invalid Input", exception.getMessage());
    }
}