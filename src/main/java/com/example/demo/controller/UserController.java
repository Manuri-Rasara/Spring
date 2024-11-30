package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user") // Maps all requests starting with api/v1/user
@CrossOrigin // Enables cross-origin requests
public class UserController {

    // Handles GET requests to api/v1/user/getuser
    @GetMapping("/getuser")
    public String getUser() {
        return "Getted";
    }

    @PostMapping("/saveuser")
    public String saveUser() {
        return "saved";
    }

}
