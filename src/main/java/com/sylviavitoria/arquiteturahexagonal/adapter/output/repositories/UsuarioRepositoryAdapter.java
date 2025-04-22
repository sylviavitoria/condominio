package com.sylviavitoria.arquiteturahexagonal.adapter.output.repositories;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.sylviavitoria.arquiteturahexagonal.adapter.output.entities.UsuarioEntity;
import com.sylviavitoria.arquiteturahexagonal.core.domain.Usuario;
import com.sylviavitoria.arquiteturahexagonal.core.ports.output.UsuarioRepositoryPort;

import ch.qos.logback.core.model.Model;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {
    
    private final UsuarioRepository usuarioRepository;
    private final ModelMapper modelMapper;

    @Override
    public Usuario create(Usuario usuario) {

        UsuarioEntity entity = modelMapper.map(usuario, UsuarioEntity.class);
        UsuarioEntity novoUsuario = usuarioRepository.save(entity);
        return modelMapper.map(novoUsuario, Usuario.class);
    }

}
