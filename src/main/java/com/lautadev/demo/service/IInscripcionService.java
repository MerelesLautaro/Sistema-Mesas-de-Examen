package com.lautadev.demo.service;

import com.lautadev.demo.model.Inscripcion;
import java.util.List;

public interface IInscripcionService {
    public void crearInscripcion(Inscripcion inscripcion);
    public List<Inscripcion> traerInscripcion();
    public Inscripcion findInscripcion(Long id);
    public void eliminarInscripcion(Long id);
    public void editarInscripcion(Inscripcion inscripcion);   
}
