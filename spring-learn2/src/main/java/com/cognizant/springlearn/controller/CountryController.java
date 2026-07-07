package com.cognizant.springlearn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.util.CountryUtil;

@RestController
public class CountryController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    /**
     * Returns India details
     * URL: http://localhost:8083/country
     */
    @RequestMapping("/country")
    public Country getCountryIndia() {

        LOGGER.info("START - getCountryIndia()");

        Country country = CountryUtil.getCountry();

        LOGGER.info("Country : {}", country);

        LOGGER.info("END - getCountryIndia()");

        return country;
    }

    /**
     * Returns all countries
     * URL: http://localhost:8083/countries
     */
    @GetMapping("/countries")
    public List<Country> getAllCountries() {

        LOGGER.info("START - getAllCountries()");

        List<Country> countries = countryService.getAllCountries();

        LOGGER.info("END - getAllCountries()");

        return countries;
    }

    /**
     * Returns country based on code
     * URL: http://localhost:8083/countries/{code}
     */
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code)
            throws CountryNotFoundException {

        LOGGER.info("START - getCountry()");

        Country country = countryService.getCountry(code);

        LOGGER.info("END - getCountry()");

        return country;
    }
}