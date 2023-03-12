package com.practice.DemoUser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.DemoUser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
