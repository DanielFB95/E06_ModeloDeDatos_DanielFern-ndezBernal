package com.salesianostriana.dam.Ejercicio01.servicios;

import com.salesianostriana.dam.Ejercicio01.modelo.Categoria;
import com.salesianostriana.dam.Ejercicio01.repositorios.CategoriaRepository;
import com.salesianostriana.dam.Ejercicio01.servicios.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServicio extends BaseService<Categoria,Long, CategoriaRepository> {


    public CategoriaServicio(CategoriaRepository repo) {
        super(repo);
    }
}
