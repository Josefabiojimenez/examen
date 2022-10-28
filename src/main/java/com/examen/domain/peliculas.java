package com.examen.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="cartelera")
public class peliculas implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcancion;
    
    String nombre;
    String autor;
    String duracion;
    String album;
    String fechapublicacion;
    
    public peliculas(){}

    public peliculas(String nombre, String autor, String duracion, String album, String fechaPublicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;
        this.album = album;
        this.fechapublicacion = fechaPublicacion;
    }
}
