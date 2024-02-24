package com.ceduk.streaming.controller;

import com.ceduk.streaming.entities.CatEstudio;
import com.ceduk.streaming.service.CatEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CatEstudioController {
    @Autowired
    private CatEstudioService service;

    @GetMapping("/estudios")
    public List<CatEstudio> getEstudiosAll(){
        return service.getEstudiosAll();
    }

    @GetMapping("/estudios/{id}")
    public Optional<CatEstudio> getEstudioById(@PathVariable Integer id){
        return service.getEstudiosById(id);
    }

    @PostMapping("/estudios/")
    public CatEstudio postEstudio(@RequestBody CatEstudio estudio){
        return service.postEstudio(estudio);
    }
}
