package com.klef.fsad.sdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.sdp.model.User;
import com.klef.fsad.sdp.model.UsersManager;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:5173")  // Adjust as needed
public class UsersController {

    @Autowired
    private UsersManager usersManager;

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody User user) {
        String result = usersManager.addUser(user);

        Map<String, Object> response = new HashMap<>();
        response.put("success", result.equalsIgnoreCase("User registered successfully"));
        response.put("message", result);

        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        String result = usersManager.validateCredentials(user.getEmail(), user.getPassword());

        Map<String, Object> response = new HashMap<>();
        if (result.equalsIgnoreCase("success")) {
            response.put("success", true);
            response.put("message", "Login successful");
            return ResponseEntity.ok(response);  // 200 OK
        } else {
            response.put("success", false);
            response.put("message", "Invalid credentials");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);  // 401 Unauthorized
        }
    }
}
