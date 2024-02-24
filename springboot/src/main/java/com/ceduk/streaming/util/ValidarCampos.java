package com.ceduk.streaming.util;

import java.lang.reflect.Field;

public class ValidarCampos {
    public <T> T actualizar(T objetoExistente, T objetoNuevo) {
        if (objetoNuevo == null && objetoExistente == null) {
            return null;
        }
        Field[] campos = objetoExistente.getClass().getDeclaredFields();
        for (Field campo : campos) {
            try {
                campo.setAccessible(true);
                Object valorNuevo = campo.get(objetoNuevo);
                if (valorNuevo != null) {
                    campo.set(objetoExistente, valorNuevo);
                }

            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        } return objetoExistente;
    }
}
