package com.lautadev.demo.controller;

import com.lautadev.demo.model.Mesa;
import com.lautadev.demo.service.IMesaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MesaController {
    @Autowired
    private IMesaService mesaServ;
    
    //Endpoints
    @PostMapping("/mesa/crear")
    public String crearMesa(@RequestBody Mesa mesa){
        mesaServ.crearMesa(mesa);
        return "Mesa creada";
    }
    
    @GetMapping("/mesa")
    public List<Mesa> traerMesas(){
        return mesaServ.traerMesa();
    }
    
    @GetMapping("/mesa/{id}")
    public Mesa findMesa(@PathVariable Long id){
        return mesaServ.findMesa(id);
    }
    
    @DeleteMapping("/mesa/eliminar/{id}")
    public void eliminarMesa(@PathVariable Long id){
        mesaServ.eliminarMesa(id);
    }
    
    @PutMapping("/mesa/editar")
    public Mesa editarMesa(@RequestBody Mesa mesa){
        mesaServ.editarMesa(mesa);
        return mesaServ.findMesa(mesa.getId());
    }
}

