
package com.jarentals.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarentals.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findUserByEmail(String email);

}
