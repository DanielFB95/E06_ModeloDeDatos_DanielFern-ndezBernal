package com.salesianostriana.dam.Ejercicio02.modelo;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Profesor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String email;
    private Double puntuacion;

    @OneToMany(mappedBy = "profesor")
    private List<CursoOnline> cursos;

    public Profesor(String nombre, String email, Double puntuacion, List<CursoOnline> cursos) {
        this.nombre = nombre;
        this.email = email;
        this.puntuacion = puntuacion;
        this.cursos = cursos;
    }

}
