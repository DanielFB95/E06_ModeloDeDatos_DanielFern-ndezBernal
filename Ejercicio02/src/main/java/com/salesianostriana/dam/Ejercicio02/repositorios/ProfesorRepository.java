package com.salesianostriana.dam.Ejercicio02.repositorios;

import com.salesianostriana.dam.Ejercicio02.modelo.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor,Long> {
}
