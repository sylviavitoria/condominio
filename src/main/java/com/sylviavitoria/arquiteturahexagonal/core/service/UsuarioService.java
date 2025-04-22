package com.sylviavitoria.arquiteturahexagonal.core.service;

import com.sylviavitoria.arquiteturahexagonal.core.domain.Usuario;
import com.sylviavitoria.arquiteturahexagonal.core.ports.input.UsuarioServicePort;
import com.sylviavitoria.arquiteturahexagonal.core.ports.output.UsuarioRepositoryPort;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UsuarioService implements UsuarioServicePort {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    @Override
    public Usuario create(Usuario usuario) {
        return usuarioRepositoryPort.create(usuario);
    }
    
}
