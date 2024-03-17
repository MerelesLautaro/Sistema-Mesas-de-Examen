package com.lautadev.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @OneToOne
    private Usuario usuario;

    public Admin() {
    }

    public Admin(Long id, Usuario usuario) {
        this.id = id;
        this.usuario = usuario;
    }

    
         
}
