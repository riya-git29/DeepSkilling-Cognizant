package com.junitspring.springtestingdemo.repository;

import com.junitspring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository<User>
        extends JpaRepository<User, Long> {

    List<User> findByName(String name);
}