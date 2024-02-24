package com.ceduk.streaming.service.impl;

import com.ceduk.streaming.entities.CtlContenidos;
import com.ceduk.streaming.repositories.CtlContenidosRepository;
import com.ceduk.streaming.service.CtlContenidosService;
import com.ceduk.streaming.util.ValidarCampos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class CtlContenidosServiceImpl implements CtlContenidosService {
    @Autowired
    private CtlContenidosRepository repository;

    @Autowired
    private ValidarCampos validarCampos;

    @Override
    public List<CtlContenidos> getAllContenidos() {
        return repository.findAll();
    }

    @Override
    public Optional<CtlContenidos> getByIdContenidos(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<CtlContenidos> getAllByFechaLanzamiento(LocalDate fecLanzamiento) {
        return repository.findByFechaLanzamiento(fecLanzamiento);
    }

    @Override
    public CtlContenidos putContenidos(CtlContenidos contenidos) {
        Optional<CtlContenidos> optionalCtlContenidos = getByIdContenidos(contenidos.getIduContenido());
        if (optionalCtlContenidos.isPresent()){
            CtlContenidos ctlContenidos = validarCampos.actualizar(optionalCtlContenidos.get(), contenidos);
            return repository.save(ctlContenidos);
        }
        return contenidos;
    }

    @Override
    public CtlContenidos postContenidos(CtlContenidos contenidos) {
        return repository.save(contenidos);
    }

    @Override
    public void deleteByIdContenidos(Integer id) {
    repository.deleteById(id);
    }
}
