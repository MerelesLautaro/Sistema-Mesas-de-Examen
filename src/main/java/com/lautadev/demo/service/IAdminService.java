package com.lautadev.demo.service;

import com.lautadev.demo.model.Admin;
import java.util.List;

public interface IAdminService {
    public void crearAdmin(Admin admin);
    public List<Admin> traerAdmins();
    public Admin findAdmin(Long id);
    public void eliminarAdmin(Long id);
    public void editarAdmin(Admin admin);  
}
