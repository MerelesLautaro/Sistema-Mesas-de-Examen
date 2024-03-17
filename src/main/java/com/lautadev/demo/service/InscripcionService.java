package com.lautadev.demo.service;

import com.lautadev.demo.model.Inscripcion;
import com.lautadev.demo.repository.IInscripcionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscripcionService implements IInscripcionService{
    @Autowired
    private IInscripcionRepository inscripRepo;
    
    @Override
    public void crearInscripcion(Inscripcion inscripcion) {
        inscripRepo.save(inscripcion);
    }

    @Override
    public List<Inscripcion> traerInscripcion() {
        List<Inscripcion> listaInscripciones = inscripRepo.findAll();
        return listaInscripciones;
    }

    @Override
    public Inscripcion findInscripcion(Long id) {
        Inscripcion inscripcion = inscripRepo.findById(id).orElse(null);
        return inscripcion;
    }

    @Override
    public void eliminarInscripcion(Long id) {
        inscripRepo.deleteById(id);
    }

    @Override
    public void editarInscripcion(Inscripcion inscripcion) {
        this.crearInscripcion(inscripcion);
    }
    
}
