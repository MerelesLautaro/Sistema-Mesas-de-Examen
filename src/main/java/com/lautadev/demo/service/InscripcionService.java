package com.lautadev.demo.service;

import com.lautadev.demo.dto.InscripcionesDTO;
import com.lautadev.demo.model.Inscripcion;
import com.lautadev.demo.repository.IInscripcionRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscripcionService implements IInscripcionService{
    @Autowired
    private IInscripcionRepository inscripRepo;
    
    @Override
    public void crearInscripcion(Inscripcion inscripcion) {
        inscripRepo.save(inscripcion);
    }

    @Override
    public List<Inscripcion> traerInscripcion() {
        List<Inscripcion> listaInscripciones = inscripRepo.findAll();
        return listaInscripciones;
    }

    @Override
    public Inscripcion findInscripcion(Long id) {
        Inscripcion inscripcion = inscripRepo.findById(id).orElse(null);
        return inscripcion;
    }

    @Override
    public void eliminarInscripcion(Long id) {
        inscripRepo.deleteById(id);
    }

    @Override
    public void editarInscripcion(Inscripcion inscripcion) {
        this.crearInscripcion(inscripcion);
    }

    @Override
    public List<InscripcionesDTO> traerInscripcionesDto() {
        List<Inscripcion> listaInscripciones =  this.traerInscripcion();
        List<InscripcionesDTO> listaInscripcionesDto = new ArrayList<>();
        for(Inscripcion inscripcion: listaInscripciones){
            InscripcionesDTO inscripDto = new InscripcionesDTO();
            inscripDto.setId(inscripcion.getId());
            inscripDto.setFechaLlamado(inscripcion.getFecha_llamado());
            inscripDto.setNombre_alumno(inscripcion.getAlumno().getNombre() );
            inscripDto.setId_alumno(inscripcion.getAlumno().getId() );
            inscripDto.setId_mesa(inscripcion.getMesa().getId() );
            inscripDto.setApellido_alumno(inscripcion.getAlumno().getApellido() );
            inscripDto.setPropuesta(inscripcion.getMesa().getPropuesta() );
            inscripDto.setNombreMateria(inscripcion.getMesa().getNombre_materia() );
            inscripDto.setPresidente(inscripcion.getMesa().getPresidente() );
            inscripDto.setPrimerVocal(inscripcion.getMesa().getPrimer_vocal() );
            inscripDto.setSegundoVocal(inscripcion.getMesa().getSegundo_vocal() );
            listaInscripcionesDto.add(inscripDto);
        }
        
        return listaInscripcionesDto;
    }

    @Override
    public InscripcionesDTO traerInscripcionDto(Long id) {
        List<InscripcionesDTO> listaInscripcionesDto = this.traerInscripcionesDto();
        for(InscripcionesDTO inscripDto:listaInscripcionesDto){
            if(inscripDto.getId().equals(id)){
                return inscripDto;
            }
        }
        return null;
    }
    
}
