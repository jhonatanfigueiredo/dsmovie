package com.devsuperior.dsmovie.repositories;

import com.devsuperior.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface UserRepository extends JpaRepository<User, Id> {

    User findByEmail(String email);
}
