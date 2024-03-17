package com.lautadev.demo.service;

import com.lautadev.demo.model.Alumno;
import java.util.List;

public interface IAlumnoService {
    public void crearAlumno(Alumno alumno);
    public List<Alumno> traerAlumno();
    public Alumno findAlumno(Long id);
    public void eliminarAlumno(Long id);
    public void editarAlumno(Alumno alumno);    
}
