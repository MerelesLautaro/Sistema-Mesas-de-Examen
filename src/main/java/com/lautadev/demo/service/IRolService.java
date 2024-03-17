package com.lautadev.demo.service;

import com.lautadev.demo.model.Rol;
import java.util.List;

public interface IRolService {
    public void crearRol(Rol rol);
    public List<Rol> traerRol();
    public Rol findRol(Long id);
    public void eliminarRol(Long id);
    public void editarRol(Rol rol);
}
