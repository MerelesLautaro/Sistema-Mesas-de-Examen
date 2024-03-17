package com.lautadev.demo.service;

import com.lautadev.demo.model.Mesa;
import java.util.List;

public interface IMesaService {
    public void crearMesa(Mesa mesa);
    public List<Mesa> traerMesa();
    public Mesa findMesa(Long id);
    public void eliminarMesa(Long id);
    public void editarMesa(Mesa mesa);
}
