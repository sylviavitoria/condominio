package com.sylviavitoria.arquiteturahexagonal.adapter.input.controllers;

import org.springframework.http.HttpStatus; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sylviavitoria.arquiteturahexagonal.adapter.input.converters.UsuarioConverter;
import com.sylviavitoria.arquiteturahexagonal.adapter.input.dtos.UsuarioDTO;
import com.sylviavitoria.arquiteturahexagonal.core.ports.input.UsuarioServicePort;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("api/v1/usuarios")
@RequiredArgsConstructor
public class UsuarioController {
    
    private final UsuarioServicePort usuarioServicePort;
    private final UsuarioConverter usuarioConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDTO create(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioConverter.toDTO(usuarioServicePort.create(usuarioConverter.toDomain(usuarioDTO)));
      
    }
}
