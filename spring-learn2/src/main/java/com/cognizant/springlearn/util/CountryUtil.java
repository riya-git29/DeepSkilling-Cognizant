package com.cognizant.springlearn.util;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.model.Country;

public class CountryUtil {

    private static ApplicationContext context;

    static {
        context = new ClassPathXmlApplicationContext("country.xml");
    }

    // Returns the India bean
    public static Country getCountry() {
        return (Country) context.getBean("country");
    }

    // Returns the list of all countries
    @SuppressWarnings("unchecked")
    public static List<Country> getCountryList() {
        return (List<Country>) context.getBean("countryList");
    }

}