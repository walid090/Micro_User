package com.example.micor_user.service;

import com.example.micor_user.entity.User;
import com.example.micor_user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserService implements IUserService{

     UserRepository userRepository;
    @Override
    public User registerUser(User user) {
       return userRepository.save(user);
    }

    @Override
    public Boolean Authentification(String name,String password) {

        List<User> c= (List<User>) userRepository.findAll();
        for(User u:c){
            if(u.getName().equals(name) && u.getPassword().equals(password)){
                return true;
            }
        }
        return false;

    }
}
