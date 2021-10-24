package com.salesianostriana.dam.Ejercicio02.repositorios;

import com.salesianostriana.dam.Ejercicio02.modelo.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Long> {
}
