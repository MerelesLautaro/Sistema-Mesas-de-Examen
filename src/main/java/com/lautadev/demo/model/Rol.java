package com.lautadev.demo.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Rol {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre_rol;
    @OneToMany(mappedBy="rol")
    private List<Usuario> listaUsuarios;

    public Rol() {
    }

    public Rol(Long id, String nombre_rol, List<Usuario> listaUsuarios) {
        this.id = id;
        this.nombre_rol = nombre_rol;
        this.listaUsuarios = listaUsuarios;
    }
      
}
