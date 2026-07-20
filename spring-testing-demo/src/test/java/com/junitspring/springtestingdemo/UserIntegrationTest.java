package com.junitspring.springtestingdemo;

import com.junitspring.springtestingdemo.entity.User;
import com.junitspring.springtestingdemo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class UserIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    UserRepository repository;

    @Test
    void integrationTest() throws Exception {

        repository.save(
                new User(1L,"Riya"));

        mockMvc.perform(
                        get("/users/1"))
                .andExpect(status().isOk())
                .andExpect(
                        jsonPath("$.name")
                                .value("Riya"));
    }
}