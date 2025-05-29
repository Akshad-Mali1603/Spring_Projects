package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.services.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	  @Autowired
	    private AdminService adminService;

	    @PostMapping("/register")
	    public String registerAdmin(@RequestBody User admin) {
	        return adminService.registerAdmin(admin);
	    }
}
