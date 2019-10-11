package com.mod.service;

import com.mod.entity.AdminEntity;
import com.mod.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepo;

    public void create(AdminEntity admin) {
        adminRepo.save(admin);
    }

    public void update(AdminEntity admin) {
        adminRepo.save(admin);
    }

    public List<AdminEntity> getAll() {
        List<AdminEntity> list = new ArrayList<>();
        adminRepo.findAll().forEach(list::add);
        return list;

    }
}
