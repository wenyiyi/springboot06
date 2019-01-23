package com.springbootweb.repository;

import com.springbootweb.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * 继承CrudRepository
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}

