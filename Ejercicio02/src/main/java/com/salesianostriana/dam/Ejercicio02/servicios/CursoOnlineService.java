package com.salesianostriana.dam.Ejercicio02.servicios;

import com.salesianostriana.dam.Ejercicio02.modelo.CursoOnline;
import com.salesianostriana.dam.Ejercicio02.repositorios.CursoOnlineRepository;
import com.salesianostriana.dam.Ejercicio02.servicios.base.BaseService;

public class CursoOnlineService extends BaseService<CursoOnline,Long, CursoOnlineRepository> {
    public CursoOnlineService(CursoOnlineRepository repo) {
        super(repo);
    }
}
