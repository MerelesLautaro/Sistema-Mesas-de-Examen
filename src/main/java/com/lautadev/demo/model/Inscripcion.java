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
public class Inscripcion {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    @JoinColumn(name="fk_alumno")
    private Alumno alumno;
    @ManyToOne
    @JoinColumn(name="fk_mesa")
    private Mesa mesa;

    public Inscripcion() {
    }

    public Inscripcion(Long id, Alumno alumno, Mesa mesa) {
        this.id = id;
        this.alumno = alumno;
        this.mesa = mesa;
    }
       
}
