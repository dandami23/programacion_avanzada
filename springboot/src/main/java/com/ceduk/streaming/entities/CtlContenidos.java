package com.ceduk.streaming.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "ctl_contenidos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CtlContenidos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idu_contenido")
    private Integer iduContenido;

    @Column(name = "des_sinopsis")
    private String desSinopsis;

    @Column(name = "fec_lanzamiento")
    private LocalDate fechalanzamiento;

    @Column(name = "hrs_duracion")
    private LocalTime Duracion;

    @Column(name = "img_portada")
    private String imgPortada;
}
