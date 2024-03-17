package com.lautadev.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Alumno {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    @OneToOne
    private Usuario usuario;
    @OneToMany(mappedBy="alumno")
    private List<Inscripcion> listaInscripciones;

    public Alumno() {
    }

    public Alumno(Long id, String nombre, String apellido, String dni, String telefono, Usuario usuario, List<Inscripcion> listaInscripciones) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.usuario = usuario;
        this.listaInscripciones = listaInscripciones;
    }       
       
}
