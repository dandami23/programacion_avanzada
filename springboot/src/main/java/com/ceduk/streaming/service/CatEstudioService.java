package com.ceduk.streaming.service;

import com.ceduk.streaming.entities.CatEstudio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CatEstudioService {
    List<CatEstudio> getEstudiosAll();

    Optional<CatEstudio> getEstudiosById(Integer Id);

    CatEstudio postEstudio (CatEstudio estudio);
}
