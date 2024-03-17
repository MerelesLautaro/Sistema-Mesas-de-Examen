package com.lautadev.demo.repository;

import com.lautadev.demo.model.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMesaRepository extends JpaRepository <Mesa,Long>{
    
}
