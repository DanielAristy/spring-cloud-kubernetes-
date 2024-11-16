package org.daristy.springcloud.msvc_curso.repository;

import org.daristy.springcloud.msvc_curso.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
