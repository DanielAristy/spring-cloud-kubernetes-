package org.daristy.springcloud.msvc_curso.services;

import org.daristy.springcloud.msvc_curso.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    List<Curso> listar();
    Optional<Curso> cursoPorId(Long id);
    Curso guardar(Curso curso);
    void eliminar(Long id);

}
