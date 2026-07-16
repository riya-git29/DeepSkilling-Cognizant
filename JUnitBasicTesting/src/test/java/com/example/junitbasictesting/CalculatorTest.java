package com.example.junitbasictesting;

import com.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}