package com.tiendaluci.tiendaluci.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tiendaluci.tiendaluci.entity.Categoria;
import com.tiendaluci.tiendaluci.repository.CategoriasRepository;
import com.tiendaluci.tiendaluci.service.IntServiceCategorias;

@Service
@Primary
public class CategoiasServiceJpa implements IntServiceCategorias {
	
	@Autowired
	private CategoriasRepository repoCategorias;

	@Override
	public List<Categoria> obtenerCategoria() {
		// TODO Auto-generated method stub
		return repoCategorias.findAll();
	}

	@Override
	public void guardar(Categoria categoria) {
		// TODO Auto-generated method stub
		repoCategorias.save(categoria);
	}

	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		Optional<Categoria> optional = repoCategorias.findById(idCategoria);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void eliminar(Integer idCategoria) {
		// TODO Auto-generated method stub
		repoCategorias.deleteById(idCategoria);
	}

	@Override
	public int numeroCategorias() {
		// TODO Auto-generated method stub
		return (int) repoCategorias.count();
	}

	@Override
	public Page<Categoria> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return repoCategorias.findAll(page);
	}

}
