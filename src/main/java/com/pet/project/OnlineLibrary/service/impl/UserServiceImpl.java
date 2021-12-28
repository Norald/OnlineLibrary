package com.pet.project.OnlineLibrary.service.impl;

import com.pet.project.OnlineLibrary.exception.UserNotFoundException;
import com.pet.project.OnlineLibrary.model.User;
import com.pet.project.OnlineLibrary.model.UserRole;
import com.pet.project.OnlineLibrary.repository.UserRepository;
import com.pet.project.OnlineLibrary.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByActualEmail(email).orElseThrow(() -> new UserNotFoundException("User with email " + email + " is not registered"));
    }

    @Override
    public UserRole getUserRole(String email) {
        return null;
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
