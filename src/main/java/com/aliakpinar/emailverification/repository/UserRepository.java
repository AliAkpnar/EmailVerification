package com.aliakpinar.emailverification.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aliakpinar.emailverification.entity.User;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, String> {
    User findByEmailIdIgnoreCase(String emailId);
}