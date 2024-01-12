package com.daniel.springbootthymeleafdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniel.springbootthymeleafdemo.model.Estudante;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long>{
    
}
