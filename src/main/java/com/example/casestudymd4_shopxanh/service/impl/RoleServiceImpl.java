package com.example.casestudymd4_shopxanh.service.impl;
import com.example.casestudymd4_shopxanh.model.Role;
import com.example.casestudymd4_shopxanh.repository.RoleRepository;
import com.example.casestudymd4_shopxanh.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Iterable<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public void save(Role role) {
        roleRepository.save(role);
    }

    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }


}