package com.lautadev.demo.service;

import com.lautadev.demo.model.Profesor;
import com.lautadev.demo.repository.IProfesorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService implements IProfesorService {
    @Autowired
    private IProfesorRepository profeRepo;
    
    @Override
    public void crearProfesor(Profesor profesor) {
        profeRepo.save(profesor);
    }

    @Override
    public List<Profesor> traerProfesor() {
        List<Profesor> listaProfesores = profeRepo.findAll();
        return listaProfesores;
    }

    @Override
    public Profesor findProfesor(Long id) {
        Profesor profesor = profeRepo.findById(id).orElse(null);
        return profesor;
    }

    @Override
    public void eliminarProfesor(Long id) {
        profeRepo.deleteById(id);
    }

    @Override
    public void editarProfesor(Profesor profesor) {
        this.crearProfesor(profesor);
    }
    
}
