package com.pet.project.OnlineLibrary.service;

import com.pet.project.OnlineLibrary.model.User;
import com.pet.project.OnlineLibrary.model.UserRole;

import java.util.List;

public interface UserService {

    User save(User user);

    User findByEmail(String email);

    UserRole getUserRole(String email);

    User findById(String id);

    List<User> findAll();
}