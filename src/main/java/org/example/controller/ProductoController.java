package org.example.controller;

import org.example.entity.Producto;
import org.example.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @PostMapping("/agregarProducto")
    public Producto agregarProducto(@RequestBody Producto producto) {
        return productoService.agregarProducto(producto);
    }
    @GetMapping("/listarProductos")
    public List<Producto> listarProductos(){
        return productoService.listarProductos();
    }
}
