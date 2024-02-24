package com.ceduk.streaming.service.impl;

import com.ceduk.streaming.entities.CatGenero;
import com.ceduk.streaming.repositories.CatGeneroRepository;
import com.ceduk.streaming.service.CatGeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatGeneroServiceImpl implements CatGeneroService {

    @Autowired
    private CatGeneroRepository repository;

    @Override
    public List<CatGenero> getGeneros() {
        return repository.findAll();
    }
}
