package com.ceduk.streaming.controller;


import com.ceduk.streaming.entities.CtlMultimedias;
import com.ceduk.streaming.service.CtlMultimediasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/multimedias/")
public class CtlMultimediasController {
    @Autowired
    public CtlMultimediasService service;

    @GetMapping
    public List<CtlMultimedias> getCtlMultimediasAll() {return service.getMultimediaAll(); }
    @GetMapping("id/{id}")
    public Optional<CtlMultimedias> getCtlMultimediasById(@PathVariable Integer id){
        return service.getMultimediaById(id);
    }
    @GetMapping
    public List<CtlMultimedias> getMultimediasByClasificacion(@RequestParam Integer clasificacion){
        return service.getAllMultimediaByIduClasificacion(clasificacion);
    }
    @GetMapping
    public List<CtlMultimedias> getMultimediasByEstudio(@RequestParam Integer estudio){
        return service.getAllMultimediaByIduEstudio(estudio);
    }@GetMapping
    public List<CtlMultimedias> getMultimediasByContenido(@RequestParam Integer contenido) {
        return service.getAllMultimediaByIduContenido(contenido);
    }
}
