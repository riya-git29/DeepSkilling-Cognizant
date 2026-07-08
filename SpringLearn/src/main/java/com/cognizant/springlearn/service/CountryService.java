package com.cognizant.springlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.springlearn.dao.CountryDao;
import com.cognizant.springlearn.model.Country;

@Service
public class CountryService {

    @Autowired
    private CountryDao countryDao;

    @Transactional(readOnly = true)
    public List<Country> getAllCountries() {
        return countryDao.getAllCountries();
    }

    @Transactional
    public Country addCountry(Country country) {
        return countryDao.addCountry(country);
    }
}