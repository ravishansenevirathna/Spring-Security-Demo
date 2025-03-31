package com.security.controller;

import com.security.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/user")
public class LoginController {

    @PostMapping
    public ResponseEntity<String> registerUser(@RequestBody User user) {

    }
}
