package com.example.tentdemo.controller;

import com.example.tentdemo.entity.User;
import com.example.tentdemo.service.UserService;
import com.example.tentdemo.util.ResponseAPI;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    // Get all users
    @GetMapping(value = "/getUserList")
    public ResponseEntity<Object> getAllUsers(HttpServletRequest req) {
        return ResponseAPI.returnDataList(req, userService.getAllUsers());
    }

    // Get user by ID
    @GetMapping(value = "/getUserById/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable Long id, HttpServletRequest req) {
        return ResponseAPI.returnDataObject(req,(Object) userService.getUserById(id));
    }

    // Create a new user
    @PostMapping(value = "/createNewUser", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createUser(@RequestBody User user, HttpServletRequest req) {
        return ResponseAPI.returnDataObject(req, userService.createUser(user));
    }

    // Update user by ID
    @PutMapping("/updateUserById/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        return userService.updateUser(id, userDetails);
    }

    // Delete user by ID
    @DeleteMapping("/deleteUserById/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
