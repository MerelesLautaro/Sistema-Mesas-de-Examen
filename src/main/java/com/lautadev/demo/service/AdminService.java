package com.lautadev.demo.service;

import com.lautadev.demo.model.Admin;
import com.lautadev.demo.repository.IAdminRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements IAdminService{
    @Autowired
    private IAdminRepository adminRepo;
    
    @Override
    public void crearAdmin(Admin admin) {
        adminRepo.save(admin);
    }

    @Override
    public List<Admin> traerAdmins() {
        List<Admin> listaAdmins = adminRepo.findAll();
        return listaAdmins;
    }

    @Override
    public Admin findAdmin(Long id) {
        Admin admin = adminRepo.findById(id).orElse(null);
        return admin;
    }

    @Override
    public void eliminarAdmin(Long id) {
        adminRepo.deleteById(id);
    }

    @Override
    public void editarAdmin(Admin admin) {
        this.crearAdmin(admin);
    }

    
}
