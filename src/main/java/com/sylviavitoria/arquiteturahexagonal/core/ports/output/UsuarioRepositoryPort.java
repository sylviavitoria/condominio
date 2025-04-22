package com.sylviavitoria.arquiteturahexagonal.core.ports.output;

import com.sylviavitoria.arquiteturahexagonal.core.domain.Usuario;

public interface UsuarioRepositoryPort {

    public Usuario create(Usuario usuario);
}