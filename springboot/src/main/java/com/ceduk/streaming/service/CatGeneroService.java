package com.ceduk.streaming.service;

import com.ceduk.streaming.entities.CatGenero;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CatGeneroService {
    List<CatGenero> getGeneros();
}
