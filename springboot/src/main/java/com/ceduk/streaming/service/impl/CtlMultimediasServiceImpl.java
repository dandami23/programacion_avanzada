package com.ceduk.streaming.service.impl;

import com.ceduk.streaming.entities.CtlMultimedias;
import com.ceduk.streaming.repositories.CtlMultimediasRepository;
import com.ceduk.streaming.service.CtlMultimediasService;
import com.ceduk.streaming.util.ValidarCampos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CtlMultimediasServiceImpl implements CtlMultimediasService {
    @Autowired
    private CtlMultimediasRepository repository;

    @Autowired
    private ValidarCampos validarCampos;

    @Override
    public List<CtlMultimedias> getMultimediaAll() {
        return repository.findAll();
    }

    @Override
    public Optional<CtlMultimedias> getMultimediaById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public CtlMultimedias postMultimedia(CtlMultimedias multimedias) {
        return repository.save(multimedias);
    }

    @Override
    public void deleteMultimediaById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<CtlMultimedias> getAllMultimediaByIduGenero(Integer id) {
        return repository.findAllByIduGeneroIduGenero(id);
    }

    @Override
    public List<CtlMultimedias> getAllMultimediaByIduClasificacion(Integer id) {
        return repository.findAllByIduClasificacionIduClasificacion(id);
    }

    @Override
    public List<CtlMultimedias> getAllMultimediaByIduEstudio(Integer id) {
        return repository.findAllByIduEstudioIduEstudio(id);
    }

    @Override
    public List<CtlMultimedias> getAllMultimediaByIduContenido(Integer id) {
        return repository.findAllByIduContenidoIduContenido(id);
    }

    @Override
    public CtlMultimedias putMultimedia(CtlMultimedias multimedias) {
        Optional<CtlMultimedias> optionalCtlMultimedias = getMultimediaById(multimedias.getIduMultimedia());
        if (optionalCtlMultimedias.isPresent()){
            CtlMultimedias ctlMultimedias = validarCampos.actualizar(optionalCtlMultimedias.get(), multimedias);
            return repository.save(multimedias);
        }
        return null;
    }
}
