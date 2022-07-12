package com.example.casestudymd4_shopxanh.service;

import com.example.casestudymd4_shopxanh.model.Role;

public interface RoleService {
    Iterable<Role> findAll();

    void save(Role role);

    Role findByName(String name);
}