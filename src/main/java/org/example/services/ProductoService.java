package org.example.services;

import org.example.entity.Producto;
import org.example.respository.RepositoryProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private RepositoryProducto repositoryProducto;
    public Producto agregarProducto(Producto producto){
        return repositoryProducto.save(producto);
    }
    public List<Producto> listarProductos(){
        return repositoryProducto.findAll();
    }
}
