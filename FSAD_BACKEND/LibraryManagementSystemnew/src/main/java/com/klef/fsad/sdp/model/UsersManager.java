package com.klef.fsad.sdp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.sdp.repository.UserRepository;

@Service
public class UsersManager {

    @Autowired
    private UserRepository userRepository;

    public String addUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            return "User already exists";
        }

        // ⚠️ In production, hash the password before saving!
        userRepository.save(user);
        return "User registered successfully";
    }

    public String validateCredentials(String email, String password) {
        User user = userRepository.findByEmail(email);

        if (user == null) {
            return "failure"; // email not found
        }

        // ⚠️ If you’re hashing passwords, replace with BCrypt check
        if (user.getPassword().equals(password)) {
            return "success";
        }

        return "failure";
    }
}
