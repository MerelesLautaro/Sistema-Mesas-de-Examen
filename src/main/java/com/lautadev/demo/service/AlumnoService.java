package com.lautadev.demo.service;

import com.lautadev.demo.model.Alumno;
import com.lautadev.demo.repository.IAlumnoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService implements IAlumnoService {
    @Autowired
    private IAlumnoRepository alumnoRepo;
    
    @Override
    public void crearAlumno(Alumno alumno) {
        alumnoRepo.save(alumno);
    }

    @Override
    public List<Alumno> traerAlumno() {
        List<Alumno> listaAlumnos = alumnoRepo.findAll();
        return listaAlumnos;
    }

    @Override
    public Alumno findAlumno(Long id) {
        Alumno alumno = alumnoRepo.findById(id).orElse(null);
        return alumno;
    }

    @Override
    public void eliminarAlumno(Long id) {
        alumnoRepo.deleteById(id);
    }

    @Override
    public void editarAlumno(Alumno alumno) {
        this.crearAlumno(alumno);
    }
    
}
