package com.cognizant.springlearn;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.cognizant.springlearn.controller.CountryController;

@SpringBootTest
@AutoConfigureMockMvc
class SpringLearnApplicationTests {

    @Autowired
    private CountryController countryController;

    @Autowired
    private MockMvc mvc;

    /**
     * Test whether CountryController is loaded successfully.
     */
    @Test
    void contextLoads() {
        assertNotNull(countryController);
    }

    /**
     * Test GET /country API.
     */
    @Test
    void testGetCountry() throws Exception {

        ResultActions actions = mvc.perform(get("/country"));

        actions.andExpect(status().isOk());

        actions.andExpect(jsonPath("$.code").exists());
        actions.andExpect(jsonPath("$.code").value("IN"));

        actions.andExpect(jsonPath("$.name").exists());
        actions.andExpect(jsonPath("$.name").value("India"));
    }

    /**
     * Test GET /countries API.
     */
    @Test
    void testGetAllCountries() throws Exception {

        ResultActions actions = mvc.perform(get("/countries"));

        actions.andExpect(status().isOk());

        actions.andExpect(jsonPath("$").isArray());
        actions.andExpect(jsonPath("$[0].code").value("IN"));
        actions.andExpect(jsonPath("$[0].name").value("India"));
    }

    /**
     * Test GET /countries/{code} API.
     */
    @Test
    void testGetCountryByCode() throws Exception {

        ResultActions actions = mvc.perform(get("/countries/IN"));

        actions.andExpect(status().isOk());

        actions.andExpect(jsonPath("$.code").value("IN"));
        actions.andExpect(jsonPath("$.name").value("India"));
    }

    /**
     * Test invalid country code.
     */
    @Test
    void testGetCountryException() throws Exception {

        ResultActions actions = mvc.perform(get("/countries/AZ"));

        actions.andExpect(status().isNotFound());
        actions.andExpect(status().reason("Country not found"));
    }

}