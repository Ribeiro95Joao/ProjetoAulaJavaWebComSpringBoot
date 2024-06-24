package com.joaohenrique.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaohenrique.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

    
}
