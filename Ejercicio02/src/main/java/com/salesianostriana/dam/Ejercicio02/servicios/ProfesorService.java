package com.salesianostriana.dam.Ejercicio02.servicios;

import com.salesianostriana.dam.Ejercicio02.modelo.Profesor;
import com.salesianostriana.dam.Ejercicio02.repositorios.ProfesorRepository;
import com.salesianostriana.dam.Ejercicio02.servicios.base.BaseService;

public class ProfesorService extends BaseService<Profesor,Long, ProfesorRepository> {
    public ProfesorService(ProfesorRepository repo) {
        super(repo);
    }
}
