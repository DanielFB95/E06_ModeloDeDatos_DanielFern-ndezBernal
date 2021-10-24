package com.salesianostriana.dam.Ejercicio02.modelo;

import lombok.*;
import org.aspectj.weaver.GeneratedReferenceTypeDelegate;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Video implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String orden;
    private String titulo;
    private String descripcion;
    private String url;

    @ManyToOne
    private CursoOnline cursoOnline;


    public Video(String orden, String titulo, String descripcion, String url, CursoOnline cursoOnline) {
        this.orden = orden;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
        this.cursoOnline = cursoOnline;
    }
}
