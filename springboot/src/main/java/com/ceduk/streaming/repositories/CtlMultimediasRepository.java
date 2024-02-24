package com.ceduk.streaming.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CtlMultimediasRepository extends JpaRepository<CtlMultimediasRepository, Integer> {
    List<com.ceduk.streaming.entities.CtlMultimedias> findAllByIduGeneroIduGenero(Integer iduGenero);
    List<com.ceduk.streaming.entities.CtlMultimedias> findAllByIduClasificacionIduClasificacion(Integer iduClasificacion);
    List<com.ceduk.streaming.entities.CtlMultimedias> findAllByIduEstudioIduEstudio(Integer iduEstudio);
    List<com.ceduk.streaming.entities.CtlMultimedias> findAllByIduContenidoIduContenido(Integer iduContenido);
}
