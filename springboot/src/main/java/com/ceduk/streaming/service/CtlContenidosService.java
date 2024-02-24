package com.ceduk.streaming.service;

import com.ceduk.streaming.entities.CtlContenidos;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public interface CtlContenidosService {
    List<CtlContenidos> getAllContenidos();

    Optional<CtlContenidos> getByIdContenidos(Integer id);

    List<CtlContenidos> getAllByFechaLanzamiento(LocalDate fecLanzamiento);

    CtlContenidos putContenidos(CtlContenidos contenidos);

    CtlContenidos postContenidos(CtlContenidos contenidos);

    void deleteByIdContenidos(Integer id);
}
