package com.pet.project.OnlineLibrary.repository;

import com.pet.project.OnlineLibrary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByActualEmail(String email);
}
