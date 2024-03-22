package com.lautadev.demo.controller;

import com.lautadev.demo.model.Alumno;
import com.lautadev.demo.service.IAlumnoService;
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
public class AlumnoController {
    @Autowired
    private IAlumnoService alumnoServ;
    
    //Endpoints
    @PostMapping("/alumno/crear")
    public String crearAlumno(@RequestBody Alumno alumno){
        alumnoServ.crearAlumno(alumno);
        return "alumno creado";
    }
    
    @GetMapping("/alumno")
    public List<Alumno> traerAlumnos(){
        return alumnoServ.traerAlumno();
    }
    
    @GetMapping("/alumno/{id}")
    public Alumno findAlumno(@PathVariable Long id){
        return alumnoServ.findAlumno(id);
    }
    
    @DeleteMapping("/alumno/eliminar/{id}")
    public void eliminarAlumno(@PathVariable Long id){
        alumnoServ.eliminarAlumno(id);
    }
    
    @PutMapping("/alumno/editar")
    public Alumno editarAlumno(@RequestBody Alumno alumno){
        alumnoServ.editarAlumno(alumno);
        return alumnoServ.findAlumno(alumno.getId());
    }
    
}

