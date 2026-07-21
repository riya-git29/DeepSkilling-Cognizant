package com.mockitodependencies.service;

import com.mockito.entity.User;
import com.mockito.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id) {

        return userRepository.findById(id)
                .orElse(null);
    }
}