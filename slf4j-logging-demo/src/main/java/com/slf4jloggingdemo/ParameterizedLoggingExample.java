package com.slf4jloggingdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(
                    ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String name = "Riya";
        int age = 21;

        logger.info(
                "User Name: {}, Age: {}",
                name,
                age);

        logger.debug(
                "Processing user {}",
                name);
    }
}
