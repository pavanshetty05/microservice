package com.jsw.token.springtoken.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.jsw.token.springtoken.entity.User;

@Service
public interface UserRepository extends JpaRepository<User, String> {

	User findByUsername(String username);
}
