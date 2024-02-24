package com.ceduk.streaming.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "ctl_multimedias")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CtlMultimedias implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idu_multimedia")
    private Integer iduMultimedia;

    @Column(name = "nom_titulo")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idu_genero")
    private CatGenero iduGenero;

    @ManyToOne
    @JoinColumn(name = "idu_clasificacion")
    private CatClasificacion iduClasificacion;

    @ManyToOne
    @JoinColumn(name = "idu_estudio")
    private CatEstudio iduEstudio;

    @ManyToOne
    @JoinColumn(name = "idu_contenido")
    private CtlContenidos iduContenido;
}
