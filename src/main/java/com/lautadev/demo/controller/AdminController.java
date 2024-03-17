package com.lautadev.demo.controller;

import com.lautadev.demo.model.Admin;
import com.lautadev.demo.service.AdminService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500/")
public class AdminController {
    @Autowired
    private AdminService adminServ;
    
    //Endpoints
    @PostMapping("/admin/crear")
    public String crearAdmin(@RequestBody Admin admin){
        adminServ.crearAdmin(admin);
        return "Admin creado";
    }
    
    @GetMapping("/admin")
    public List<Admin> traerAdmins(){
        return adminServ.traerAdmins();
    }
    
    @GetMapping("/admin/{id}")
    public Admin findAdmin(@PathVariable Long id){
        return adminServ.findAdmin(id);
    }
    
    @DeleteMapping("/admin/eliminar/{id}")
    public void eliminarAdmin(@PathVariable Long id){
        adminServ.eliminarAdmin(id);
    }
    
    @PutMapping("/admin/editar")
    public Admin editarAdmin(@RequestBody Admin admin){
        adminServ.editarAdmin(admin);
        return adminServ.findAdmin(admin.getId());
    }
}

