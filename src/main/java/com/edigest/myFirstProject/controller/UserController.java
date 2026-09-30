package com.edigest.myFirstProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.edigest.myFirstProject.service.UserService;
import  com.edigest.myFirstProject.entity.User;
import jakarta.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.List;


@RequestMapping("user")
@RestController

public class UserController {

   private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/id/{id}")
    public User showUser(@PathVariable int id)
    {
        return userService.getUser(id);
    }
    @GetMapping
    public List<User> showUsers(HttpServletRequest request)
    {
		// Extract the incoming device's IP address
        String clientIp = request.getRemoteAddr();
        
        // Print it directly into your laptop's IDE / Terminal console
        System.out.println("====== INCOMING REQUEST ======");
        System.out.println("Request received from IP Address: " + clientIp);
        System.out.println("==============================");
        return userService.getUsers();
    }

    @PostMapping
    public String addUser(@RequestBody User user)
    {

        return  "User added succesfully "+userService.addUser(user).toString();
    }



}
