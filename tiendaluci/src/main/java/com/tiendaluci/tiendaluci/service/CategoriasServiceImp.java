package com.tiendaluci.tiendaluci.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tiendaluci.tiendaluci.entity.Categoria;

@Service
public class CategoriasServiceImp implements IntServiceCategorias {
	
	private List<Categoria> categorias = null;

	@Override
	public List<Categoria> obtenerCategoria() {
		// TODO Auto-generated method stub
		return categorias;
	}

	@Override
	public void guardar(Categoria categoria) {
		// TODO Auto-generated method stub
		categorias.add(categoria);
	}

	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		for(Categoria cat : categorias) {
			if(cat.getId_cat().compareTo(idCategoria) == 0) {
				return cat;
			}
		}
		return null;
	}

	@Override
	public void eliminar(Integer idCategoria) {
		// TODO Auto-generated method stub
		categorias.remove(buscarPorId(idCategoria));
	}

	@Override
	public int numeroCategorias() {
		// TODO Auto-generated method stub
		return categorias.size();
	}

	@Override
	public Page<Categoria> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

}
