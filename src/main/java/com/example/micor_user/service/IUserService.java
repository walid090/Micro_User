package com.example.micor_user.service;

import com.example.micor_user.entity.User;

public interface IUserService {
    public User registerUser(User user);
    public Boolean Authentification(String name,String password);

}
