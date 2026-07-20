package com.junitspring.springtestingdemo;

import com.junitspring.springtestingdemo.entity.User;
import com.junitspring.springtestingdemo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Test
    void testFindByName() {

        repository.save(
                new User(1L,"Riya"));

        List<User> users =
                repository.findByName("Riya");

        assertEquals(
                1,
                users.size());
    }
}