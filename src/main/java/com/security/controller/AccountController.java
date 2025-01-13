package com.security.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/account")
public class AccountController {

    @GetMapping("/getAll")
    public String getAllAccounts() {
        return "All accounts retrieved successfully.";
    }
}
