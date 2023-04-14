package com.tiendaluci.tiendaluci.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tiendaluci.tiendaluci.entity.Producto;

public class ProductosServiceImp implements IntServiceProductos {
	
	private List<Producto> productos = null;

	@Override
	public List<Producto> obtenerProductos() {
		// TODO Auto-generated method stub
		return productos;
	}

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		productos.add(producto);
	}

	@Override
	public Producto buscarPorId(Integer idProducto) {
		for(Producto prod: productos) {
			if(prod.getId_prod().compareTo(idProducto) == 0) {
				return prod;
			}
		}
		return null;
	}

	@Override
	public void eliminar(Integer idProducto) {
		// TODO Auto-generated method stub
		productos.remove(buscarPorId(idProducto));
	}

	@Override
	public int numeroProductos() {
		// TODO Auto-generated method stub
		return productos.size();
	}

	@Override
	public Page<Producto> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

}
