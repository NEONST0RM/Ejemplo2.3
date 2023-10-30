package org.example.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TABLA_PRODUCTO")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;

    private int cantidad;
    private Double precio;
}
