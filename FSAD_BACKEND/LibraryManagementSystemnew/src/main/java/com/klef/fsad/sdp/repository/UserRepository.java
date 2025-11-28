package com.klef.fsad.sdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.fsad.sdp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	User findByEmail(String email);
    User findByEmailAndPassword(String email, String password);
}
