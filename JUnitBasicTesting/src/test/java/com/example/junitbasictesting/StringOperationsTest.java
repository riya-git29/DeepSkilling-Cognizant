package com.example.junitbasictesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringOperationsTest {

    private StringOperations operations;

    @Before
    public void setUp() {
        operations = new StringOperations();
        System.out.println("Setup Executed");
    }

    @After
    public void tearDown() {
        operations = null;
        System.out.println("Teardown Executed");
    }

    @Test
    public void testUpperCase() {

        // Arrange
        String input = "hello";

        // Act
        String result = operations.toUpper(input);

        // Assert
        assertEquals("HELLO", result);
    }

    @Test
    public void testLength() {

        // Arrange
        String input = "JUnit";

        // Act
        int result = operations.length(input);

        // Assert
        assertEquals(5, result);
    }
}