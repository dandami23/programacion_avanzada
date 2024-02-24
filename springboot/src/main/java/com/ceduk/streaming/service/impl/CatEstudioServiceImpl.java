package com.ceduk.streaming.service.impl;

import com.ceduk.streaming.entities.CatEstudio;
import com.ceduk.streaming.repositories.CatEstudioRepository;
import com.ceduk.streaming.service.CatEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatEstudioServiceImpl implements CatEstudioService{

    @Autowired
    private CatEstudioRepository repository;
    @Override
    public List<CatEstudio> getEstudiosAll() {
        return repository.findAll();
    }

    @Override
    public Optional<CatEstudio> getEstudiosById(Integer id) { return repository.findById(id); }

    @Override
    public CatEstudio postEstudio(CatEstudio estudio) {
        return repository.save(estudio);
    }
}
