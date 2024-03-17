package com.lautadev.demo.controller;

import com.lautadev.demo.model.Profesor;
import com.lautadev.demo.service.IProfesorService;
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
public class ProfesorController {
    @Autowired
    private IProfesorService profeServ;
    
    //Endpoints
    @PostMapping("/profesor/crear")
    public String crearProfesor(@RequestBody Profesor profesor){
        profeServ.crearProfesor(profesor);
        return "Profesor Creado";
    }
    
    @GetMapping("/profesor")
    public List<Profesor> traerProfesores(){
        return profeServ.traerProfesor();
    }
    
    @GetMapping("/profesor/{id}")
    public Profesor findProfesor(@PathVariable Long id){
        return profeServ.findProfesor(id);
    }
    
    @DeleteMapping("/profesor/eliminar/{id}")
    public void eliminarProfesor(@PathVariable Long id){
        profeServ.eliminarProfesor(id);
    }
    
    @PutMapping("/profesor/editar")
    public Profesor editarProfesor(@RequestBody Profesor profesor){
        profeServ.editarProfesor(profesor);
        return profeServ.findProfesor(profesor.getId());
    }
}
