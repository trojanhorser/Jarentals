package com.jarentals.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jarentals.domain.User;

public interface UserRepository extends  JpaRepository<User, Integer> {
	
}
