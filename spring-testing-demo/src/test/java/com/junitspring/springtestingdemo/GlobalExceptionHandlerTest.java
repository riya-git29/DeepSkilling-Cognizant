package com.junitspring.springtestingdemo;

import com.junitspring.springtestingdemo.MockBean;
import com.junitspring.springtestingdemo.controller.UserController;
import com.junitspring.springtestingdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.NoSuchElementException;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
class GlobalExceptionHandlerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    UserService service;

    @Test
    void testExceptionHandler()
            throws Exception {

        when(service.getUserById(1L))
                .thenThrow(
                        new NoSuchElementException());

        mockMvc.perform(
                        get("/users/1"))
                .andExpect(status().isNotFound())
                .andExpect(
                        content().string(
                                "User not found"));
    }
}