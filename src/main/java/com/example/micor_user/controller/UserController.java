package com.example.micor_user.controller;


import com.example.micor_user.entity.User;
import com.example.micor_user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
@AllArgsConstructor
public class UserController {
    @Autowired
    private  UserService userService;
    @PostMapping("/Register")
    public User registerUser(@RequestBody User user){
        return userService.registerUser(user);
    }
    @GetMapping("/login/{name}/{password}")
    public Boolean Authentification(@PathVariable("name") String name,@PathVariable("password") String password){
        return userService.Authentification(name,password);
    }
}
