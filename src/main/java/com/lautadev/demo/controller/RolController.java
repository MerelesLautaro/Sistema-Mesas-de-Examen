package com.lautadev.demo.controller;


import com.lautadev.demo.model.Rol;
import com.lautadev.demo.service.IRolService;
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
public class RolController {
    @Autowired
    private IRolService rolServ;
    
    //Endpoints
    @PostMapping("/rol/crear")
    public String crearRol(@RequestBody Rol rol){
        rolServ.crearRol(rol);
        return "Rol creado";
    }
    
    @GetMapping("/rol")
    public List<Rol> traerRoles(){
        return rolServ.traerRol();
    }
    
    @GetMapping("/rol/{id}")
    public Rol findRol(@PathVariable Long id){
        return rolServ.findRol(id);
    }
    
    @DeleteMapping("/rol/eliminar/{id}")
    public void eliminarRol(@PathVariable Long id){
        rolServ.eliminarRol(id);
    }
    
    @PutMapping("/rol/editar")
    public Rol editarRol(@RequestBody Rol rol){
        rolServ.editarRol(rol);
        return rolServ.findRol(rol.getId());
    }
    
}

