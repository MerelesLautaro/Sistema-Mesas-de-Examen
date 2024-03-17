package com.lautadev.demo.service;

import com.lautadev.demo.model.Mesa;
import com.lautadev.demo.repository.IMesaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MesaService implements IMesaService {
    @Autowired
    private IMesaRepository mesaRepo;
    
    @Override
    public void crearMesa(Mesa mesa) {
        mesaRepo.save(mesa);
    }

    @Override
    public List<Mesa> traerMesa() {
        List<Mesa> listaMesas = mesaRepo.findAll();
        return listaMesas;
    }

    @Override
    public Mesa findMesa(Long id) {
        Mesa mesa = mesaRepo.findById(id).orElse(null);
        return mesa;
    }

    @Override
    public void eliminarMesa(Long id) {
        mesaRepo.deleteById(id);
    }

    @Override
    public void editarMesa(Mesa mesa) {
        this.crearMesa(mesa);
    }
    
}
