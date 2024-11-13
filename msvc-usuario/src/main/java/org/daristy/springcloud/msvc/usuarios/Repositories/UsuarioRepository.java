package org.daristy.springcloud.msvc.usuarios.Repositories;


import org.daristy.springcloud.msvc.usuarios.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}

