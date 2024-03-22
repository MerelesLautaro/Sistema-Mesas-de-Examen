package com.lautadev.demo.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Inscripcion {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private Date fecha_llamado;
    @ManyToOne
    @JoinColumn(name="fk_alumno")
    private Alumno alumno;
    @ManyToOne
    @JoinColumn(name="fk_mesa")
    private Mesa mesa;

    public Inscripcion() {
    }

    public Inscripcion(Long id, Date fecha_llamado, Alumno alumno, Mesa mesa) {
        this.id = id;
        this.fecha_llamado = fecha_llamado;
        this.alumno = alumno;
        this.mesa = mesa;
    }     
}
