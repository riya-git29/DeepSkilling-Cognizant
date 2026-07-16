package com.example.junitadvancedtesting;

import com.example.junitadvancedtesting.EvenCheckerTest;
import com.example.junitadvancedtesting.ExceptionThrowerTest;
import com.example.junitadvancedtesting.OrderedTests;
import com.example.junitadvancedtesting.PerformanceTesterTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        EvenCheckerTest.class,
        OrderedTests.class,
        ExceptionThrowerTest.class,
        PerformanceTesterTest.class
})
public class AllTests {
}