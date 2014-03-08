
package com.jarentals.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.jarentals.domain.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
