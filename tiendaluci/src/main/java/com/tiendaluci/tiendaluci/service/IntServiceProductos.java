package com.tiendaluci.tiendaluci.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tiendaluci.tiendaluci.entity.Producto;

public interface IntServiceProductos {
	public List<Producto> obtenerProductos();
	public void guardar(Producto producto);
	public Producto buscarPorId(Integer idProducto);
	public void eliminar(Integer idProducto);
	public int numeroProductos();
	Page<Producto>buscarTodas(Pageable page);
}
