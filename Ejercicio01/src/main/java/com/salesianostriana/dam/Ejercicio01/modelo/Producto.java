package com.salesianostriana.dam.Ejercicio01.modelo;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private Double pvp;

    @ManyToOne
    private Categoria categoria;

    public Producto(String nombre, Double pvp) {
        this.nombre = nombre;
        this.pvp = pvp;
    }

    public void addToCategoria(Categoria categoria){
        this.categoria = categoria;
        categoria.getProductos().add(this);
    }

    public void removeFromCategoria(Categoria categoria){
        categoria.getProductos().remove(this);
        this.categoria = null;
    }

}
