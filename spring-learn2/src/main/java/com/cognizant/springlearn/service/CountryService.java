package com.cognizant.springlearn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.util.CountryUtil;

@Service
public class CountryService {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryService.class);

    /**
     * Returns the list of all countries.
     */
    public List<Country> getAllCountries() {

        LOGGER.info("START - getAllCountries()");

        List<Country> countries = CountryUtil.getCountryList();

        LOGGER.info("END - getAllCountries()");

        return countries;
    }

    /**
     * Returns a country based on the country code.
     * Matching is case-insensitive.
     */
    public Country getCountry(String code) throws CountryNotFoundException {

        LOGGER.info("START - getCountry()");

        List<Country> countries = CountryUtil.getCountryList();

        for (Country country : countries) {

            if (country.getCode().equalsIgnoreCase(code)) {

                LOGGER.info("Country Found : {}", country);

                LOGGER.info("END - getCountry()");

                return country;
            }
        }

        LOGGER.error("Country Code {} not found.", code);

        throw new CountryNotFoundException();
    }
}