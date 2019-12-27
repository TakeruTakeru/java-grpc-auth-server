package com.example.auth.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.auth.data.model.Users;

@Repository
public interface UserDao extends JpaRepository<Users, Integer> {

}
