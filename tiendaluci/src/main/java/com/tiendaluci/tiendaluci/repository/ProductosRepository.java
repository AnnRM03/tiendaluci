package com.tiendaluci.tiendaluci.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiendaluci.tiendaluci.entity.Producto;

public interface ProductosRepository extends JpaRepository<Producto, Integer> {

}
