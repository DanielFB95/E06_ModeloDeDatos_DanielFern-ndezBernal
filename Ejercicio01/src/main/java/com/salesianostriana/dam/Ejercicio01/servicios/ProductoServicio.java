package com.salesianostriana.dam.Ejercicio01.servicios;

import com.salesianostriana.dam.Ejercicio01.modelo.Producto;
import com.salesianostriana.dam.Ejercicio01.repositorios.ProductoRepository;
import com.salesianostriana.dam.Ejercicio01.servicios.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicio extends BaseService<Producto,Long, ProductoRepository> {


    public ProductoServicio(ProductoRepository repo) {
        super(repo);
    }
}
