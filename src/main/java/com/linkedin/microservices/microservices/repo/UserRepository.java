package com.linkedin.microservices.microservices.repo;


import com.linkedin.microservices.microservices.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

/**
 * Created by Mary Ellen Bowman.
 */
@RepositoryRestResource(exported = true)
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String userName);
}