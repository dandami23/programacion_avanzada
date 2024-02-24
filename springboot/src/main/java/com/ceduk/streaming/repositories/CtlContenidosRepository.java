package com.ceduk.streaming.repositories;

import com.ceduk.streaming.entities.CtlContenidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDate;
import java.util.List;


@RepositoryRestResource
public interface CtlContenidosRepository extends JpaRepository<CtlContenidos, Integer> {
    List<CtlContenidos> findByFechaLanzamiento(LocalDate fechaLanzamiento);
}
