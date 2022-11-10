package com.example.springboot4.controller;

import com.example.springboot4.bean.User;
import com.example.springboot4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @ResponseBody
    @GetMapping("/acct/{id}")
    public User getUserById(@RequestParam("id") Integer id){

       User userById = userService.getUserById(id);

        return userById;
    }
}
