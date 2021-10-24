package com.salesianostriana.dam.Ejercicio01.repositorios;

import com.salesianostriana.dam.Ejercicio01.modelo.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
