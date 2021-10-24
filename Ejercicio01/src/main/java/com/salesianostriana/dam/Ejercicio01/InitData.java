package com.salesianostriana.dam.Ejercicio01;

import com.salesianostriana.dam.Ejercicio01.modelo.Categoria;
import com.salesianostriana.dam.Ejercicio01.modelo.Producto;
import com.salesianostriana.dam.Ejercicio01.repositorios.CategoriaRepository;
import com.salesianostriana.dam.Ejercicio01.repositorios.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class InitData {

    private final CategoriaRepository categoriaRepository;
    private final ProductoRepository productoRepository;

    @PostConstruct
    public void init(){

        Producto p1 = new Producto("producto01",1.5);
        Producto p2 = new Producto("producto02",2.5);
        Producto p3 = new Producto("producto03",3.5);


        List<Producto> listaProductos01 = new ArrayList<>();
        listaProductos01.add(p1);
        listaProductos01.add(p2);

        List<Producto> listaProductos02 = new ArrayList<>();


        categoriaRepository.save(new Categoria("categoria01",listaProductos01));
        categoriaRepository.save(new Categoria("categoria01",listaProductos02));


        p3.addToCategoria(categoriaRepository.getById(1L));
        System.out.println(categoriaRepository.getById(1L));
        p2.removeFromCategoria(categoriaRepository.getById(0L));
        System.out.println(categoriaRepository.getById(0L));

    }
}
