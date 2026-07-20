package com.junitspring.springtestingdemo;

import com.junitspring.springtestingdemo.entity.User;
import com.junitspring.springtestingdemo.repository.UserRepository;
import com.junitspring.springtestingdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    UserRepository repository;

    @InjectMocks
    UserService service;

    @Test
    void testGetUser() {

        User user =
                new User(1L,"Riya");

        when(repository.findById(1L))
                .thenReturn(Optional.of(user));

        User result =
                service.getUserById(1L);

        assertEquals(
                "Riya",
                result.getName());
    }
}