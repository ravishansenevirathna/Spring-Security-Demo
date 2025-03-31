package com.security.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/notice")
public class NoticeController {

    @GetMapping("/getAll")
    public String getAllAccounts() {
        return "All notices fetched successfully.";
    }
}
