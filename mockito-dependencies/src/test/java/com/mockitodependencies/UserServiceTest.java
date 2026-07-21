package com.mockitodependencies;

import com.mockito.entity.User;
import com.mockito.repository.UserRepository;
import com.mockito.service.UserService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserService service;

    @Test
    void testGetUserById() {

        User user =
                new User(1L, "Riya");

        when(repository.findById(1L))
                .thenReturn(Optional.of(user));

        User result =
                service.getUserById(1L);

        assertNotNull(result);

        assertEquals(
                "Riya",
                result.getName());

        verify(repository)
                .findById(1L);
    }
}