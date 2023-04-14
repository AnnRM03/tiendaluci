package com.tiendaluci.tiendaluci.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tiendaluci.tiendaluci.entity.Categoria;

public interface IntServiceCategorias {
	public List<Categoria> obtenerCategoria();
	public void guardar(Categoria categoria);
	public Categoria buscarPorId(Integer idCategoria);
	public void eliminar(Integer idCategoria);
	public int numeroCategorias();
	Page<Categoria>buscarTodas(Pageable page);
}
