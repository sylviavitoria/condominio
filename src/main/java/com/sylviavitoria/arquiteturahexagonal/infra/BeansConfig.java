package com.sylviavitoria.arquiteturahexagonal.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sylviavitoria.arquiteturahexagonal.core.ports.input.UsuarioServicePort;
import com.sylviavitoria.arquiteturahexagonal.core.ports.output.UsuarioRepositoryPort;
import com.sylviavitoria.arquiteturahexagonal.core.service.UsuarioService;
import org.modelmapper.ModelMapper; 


@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public UsuarioServicePort usuarioServiceImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
        return new UsuarioService(usuarioRepositoryPort);
    }
    
}