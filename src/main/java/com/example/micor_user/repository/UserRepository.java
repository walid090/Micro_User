package com.example.micor_user.repository;

import com.example.micor_user.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
