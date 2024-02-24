package com.ceduk.streaming.controller;


import com.ceduk.streaming.entities.CatGenero;
import com.ceduk.streaming.service.CatGeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatGeneroController {
    @Autowired
    private CatGeneroService service;

    @GetMapping("/generos")
    public List<CatGenero> getCatGenero() { return service.getGeneros(); }
}
