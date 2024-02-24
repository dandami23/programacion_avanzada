package com.ceduk.streaming.service;

import com.ceduk.streaming.entities.CtlMultimedias;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CtlMultimediasService {
    List<CtlMultimedias> getMultimediaAll();


    Optional<CtlMultimedias> getMultimediaById(Integer id);

    CtlMultimedias postMultimedia(CtlMultimedias multimedias);

    void deleteMultimediaById(Integer id);

    List<CtlMultimedias> getAllMultimediaByIduGenero(Integer id);

    List<CtlMultimedias> getAllMultimediaByIduClasificacion(Integer id);

    List<CtlMultimedias> getAllMultimediaByIduEstudio(Integer id);

    List<CtlMultimedias> getAllMultimediaByIduContenido(Integer id);

    CtlMultimedias putMultimedia(CtlMultimedias multimedias);
}
