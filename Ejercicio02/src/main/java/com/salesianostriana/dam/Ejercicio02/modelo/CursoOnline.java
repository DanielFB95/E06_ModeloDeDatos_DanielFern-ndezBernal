package com.salesianostriana.dam.Ejercicio02.modelo;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class CursoOnline implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private Double puntuacion;

    @ManyToOne
    private Profesor profesor;

    @OneToMany(mappedBy = "cursoOnline", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Video> videos = new ArrayList<>();

    public CursoOnline(String nombre, Double puntuacion, Profesor profesor, List<Video> videos) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.profesor = profesor;
        this.videos = videos;
    }

    public void addToProfesor(Profesor profesor){
        this.profesor = profesor;
        profesor.getCursos().add(this);
    }

    public void removeFromProfesor(Profesor profesor){
        profesor.getCursos().remove(this);
        this.profesor = null;
    }

    public void addVideo(Video v) {
        v.setCursoOnline(this);
        this.videos.add(v);
    }

    public void removeVideo(Video v) {
        this.videos.remove(v);
        v.setCursoOnline(null);
    }
}
