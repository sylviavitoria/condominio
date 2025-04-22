package com.sylviavitoria.arquiteturahexagonal.adapter.input.converters;

import org.springframework.stereotype.Component;

import com.sylviavitoria.arquiteturahexagonal.adapter.input.dtos.UsuarioDTO;
import com.sylviavitoria.arquiteturahexagonal.core.domain.Usuario;

@Component
public class UsuarioConverter {
    public Usuario toDomain(UsuarioDTO usuarioDTO) {
        return new Usuario(usuarioDTO.getId(), usuarioDTO.getNome(), usuarioDTO.getEmail(), usuarioDTO.getSenha(), usuarioDTO.getAdmin());
    }

    public UsuarioDTO toDTO(Usuario usuario) {
        return new UsuarioDTO(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getSenha(), usuario.getAdmin());
    }
}
