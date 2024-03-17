package com.lautadev.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre_usuario;
    private String contrasenia_usuario;
    @ManyToOne
    @JoinColumn(name="fk_rol")
    private Rol rol;

    public Usuario() {
    }

    public Usuario(Long id, String nombre_usuario, String contrasenia_usuario, Rol rol) {
        this.id = id;
        this.nombre_usuario = nombre_usuario;
        this.contrasenia_usuario = contrasenia_usuario;
        this.rol = rol;
    }
      
}
