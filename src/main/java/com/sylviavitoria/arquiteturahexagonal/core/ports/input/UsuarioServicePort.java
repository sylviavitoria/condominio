package com.sylviavitoria.arquiteturahexagonal.core.ports.input;

import com.sylviavitoria.arquiteturahexagonal.core.domain.Usuario;

public interface UsuarioServicePort {
    Usuario create(Usuario usuario);
}
