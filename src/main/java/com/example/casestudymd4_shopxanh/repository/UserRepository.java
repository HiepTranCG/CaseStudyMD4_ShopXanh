package com.example.casestudymd4_shopxanh.repository;

import com.example.casestudymd4_shopxanh.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}