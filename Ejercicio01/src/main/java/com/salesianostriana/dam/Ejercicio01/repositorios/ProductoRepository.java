package com.salesianostriana.dam.Ejercicio01.repositorios;

import com.salesianostriana.dam.Ejercicio01.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Long> {
}
