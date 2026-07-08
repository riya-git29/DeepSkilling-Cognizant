package com.cognizant.springlearn.dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.model.Country;

@Repository
public class CountryDao {

    private static ArrayList<Country> COUNTRY_LIST;

    @SuppressWarnings("unchecked")
    public CountryDao() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        COUNTRY_LIST = (ArrayList<Country>) context.getBean("countryList");
    }

    public ArrayList<Country> getAllCountries() {
        return COUNTRY_LIST;
    }

    public Country addCountry(Country country) {
        COUNTRY_LIST.add(country);
        return country;
    }
}