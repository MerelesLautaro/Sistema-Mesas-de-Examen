package com.lautadev.demo.repository;

import com.lautadev.demo.model.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInscripcionRepository extends JpaRepository<Inscripcion,Long> {
    
}
