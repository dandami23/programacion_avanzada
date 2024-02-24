package com.ceduk.streaming.controller;

import com.ceduk.streaming.entities.CatClasificacion;
import com.ceduk.streaming.service.CatClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CatClasificacionController {
    @Autowired
private CatClasificacionService service;

    @GetMapping("/clasificacion")
    public List<CatClasificacion> getCatClasificacionAll() { return service.getClasificacionAll(); }

    @GetMapping("/clasificacion/")
    public Optional<CatClasificacion> getClasificacionById(@RequestParam Integer id){
        return service.getClasificacionById(id);
    }

    @PostMapping("/clasificacion")
    public CatClasificacion postClasificacion(@RequestBody CatClasificacion clasificacion) {
        return service.postClasificacion(clasificacion);
    }

    @PutMapping("/clasificacion")
    public CatClasificacion putClasficacion(@RequestBody CatClasificacion clasificacion) {
        return service.putClasificacion(clasificacion);
    }
    @DeleteMapping("/clasificacion/")
    public String deleteClasificacionById(@RequestParam Integer id){
        service.deleteClasificacionById(id);
        return "El registro se ha eliminado correctamente";

    }
    @GetMapping("/clasificacion/")
    public Optional<CatClasificacion> getClasificacionByTipo(@RequestParam Integer tipo){
        return service.getClasificacionById(tipo);
    }

}
