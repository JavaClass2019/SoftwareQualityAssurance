package com.msikwese.codingstandards.repositories;

import com.msikwese.codingstandards.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
