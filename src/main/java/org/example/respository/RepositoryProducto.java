package org.example.respository;

import org.example.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProducto extends JpaRepository<Producto, Integer> {
}
