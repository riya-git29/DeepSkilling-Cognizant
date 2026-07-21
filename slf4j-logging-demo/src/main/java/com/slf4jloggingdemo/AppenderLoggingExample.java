package com.slf4jloggingdemo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(
                    AppenderLoggingExample.class);

    public static void main(String[] args) {

        logger.info("Application Started");

        logger.debug("Debug Message");

        logger.warn("Warning Message");

        logger.error("Error Message");

        logger.info("Application Finished");
    }
}