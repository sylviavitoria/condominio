package com.sylviavitoria.arquiteturahexagonal.adapter.output.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sylviavitoria.arquiteturahexagonal.adapter.output.entities.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    

    
} 
