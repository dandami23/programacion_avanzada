package com.ceduk.streaming.controller;

import com.ceduk.streaming.entities.CatTipo;
import com.ceduk.streaming.service.CatTipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CatTipoController {
    @Autowired
    private CatTipoService service;

    @GetMapping("/tipos")
    public List<CatTipo> getTiposAll(){
        return service.getTiposAll();
    }
    @GetMapping("/tipos/")
    public Optional<CatTipo> getTipoById(@RequestParam Integer id){
    return service.getTipoById(id);
    }

    @PostMapping("/tipos/")
    public CatTipo postTipo(@RequestBody CatTipo tipo){
        return service.postTipo(tipo);
    }

    @DeleteMapping("/tipos/")
    public String deleteTipoById(@RequestParam Integer id){
        service.deleteTipoById(id);
            return "El registro se ha eliminado correctamente";

    }
}
