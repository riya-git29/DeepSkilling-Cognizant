package com.junitspring.springtestingdemo;

import com.junitspring.springtestingdemo.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorServiceTest {

    @Autowired
    CalculatorService calculatorService;

    @Test
    void testAdd() {

        assertEquals(
                10,
                calculatorService.add(4,6));
    }
}