package com.lautadev.demo.repository;

import com.lautadev.demo.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRepository extends JpaRepository<Alumno,Long>{
    
}
