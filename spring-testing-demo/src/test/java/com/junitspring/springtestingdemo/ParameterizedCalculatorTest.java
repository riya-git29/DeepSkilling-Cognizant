package com.junitspring.springtestingdemo;

import com.junitspring.springtestingdemo.service.CalculatorService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterizedCalculatorTest {

    CalculatorService service =
            new CalculatorService();

    @ParameterizedTest
    @CsvSource({
            "2,3,5",
            "5,5,10",
            "10,15,25"
    })
    void testAdd(
            int a,
            int b,
            int expected) {

        assertEquals(
                expected,
                service.add(a,b));
    }
}