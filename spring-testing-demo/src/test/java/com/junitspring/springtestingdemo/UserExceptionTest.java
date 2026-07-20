package com.junitspring.springtestingdemo;

import com.junitspring.springtestingdemo.repository.UserRepository;
import com.junitspring.springtestingdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserExceptionTest {

    @Mock
    UserRepository repository;

    @InjectMocks
    UserService service;

    @Test
    void testUserNotFound() {

        when(repository.findById(1L))
                .thenReturn(Optional.empty());

        assertThrows(
                NoSuchElementException.class,
                () -> service.getUserById(1L));
    }
}