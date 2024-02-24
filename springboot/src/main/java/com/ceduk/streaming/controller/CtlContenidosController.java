package com.ceduk.streaming.controller;

import com.ceduk.streaming.entities.CtlContenidos;
import com.ceduk.streaming.service.CtlContenidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/contenidos/")
public class CtlContenidosController {
    @Autowired
    public CtlContenidosService service;

    @GetMapping
    public List<CtlContenidos> getCtlContenidosAll(){
        return service.getAllContenidos();
    }

    @GetMapping("id/{id}")
    public Optional<CtlContenidos> getCtlContenidoById(@PathVariable Integer id){
        return service.getByIdContenidos(id);
    }

    @GetMapping("/feclanzamiento/{fecha}")
    public List<CtlContenidos> getByFechaLanzamiento(
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate fecha
            ) {
        return service.getAllByFechaLanzamiento(fecha);
    }

    @PutMapping
    public CtlContenidos putContenidos(@RequestBody CtlContenidos contenidos){
        return service.putContenidos(contenidos);
    }

    @PostMapping
    public CtlContenidos postContenidos(@RequestBody CtlContenidos contenidos){
        return service.postContenidos(contenidos);
    }

    @DeleteMapping
    public String deleteByIdContenidos(@RequestParam Integer id){
        service.deleteByIdContenidos(id);
        return "El registro se ha eliminado correctamente";
    }
}
