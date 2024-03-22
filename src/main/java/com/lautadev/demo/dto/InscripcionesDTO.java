package com.lautadev.demo.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class InscripcionesDTO {
    private Long id;
    private Date fechaLlamado;
    private Long id_alumno;
    private Long id_mesa;
    private String nombre_alumno;
    private String apellido_alumno;
    private String propuesta;
    private String nombreMateria;
    private String presidente;
    private String primerVocal;
    private String segundoVocal;

    public InscripcionesDTO() {
    }

    public InscripcionesDTO(Long id, Date fechaLlamado, Long id_alumno, Long id_mesa, String nombre_alumno, String apellido_alumno, String propuesta, String nombreMateria, String presidente, String primerVocal, String segundoVocal) {
        this.id = id;
        this.fechaLlamado = fechaLlamado;
        this.id_alumno = id_alumno;
        this.id_mesa = id_mesa;
        this.nombre_alumno = nombre_alumno;
        this.apellido_alumno = apellido_alumno;
        this.propuesta = propuesta;
        this.nombreMateria = nombreMateria;
        this.presidente = presidente;
        this.primerVocal = primerVocal;
        this.segundoVocal = segundoVocal;
    }

   

    

    
}
