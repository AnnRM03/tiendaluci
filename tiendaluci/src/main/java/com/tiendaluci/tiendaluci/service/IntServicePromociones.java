package com.tiendaluci.tiendaluci.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tiendaluci.tiendaluci.entity.Promocion;

public interface IntServicePromociones {
	public List<Promocion> obtenerPromociones();
	public void guardar(Promocion promocion);
	public Promocion buscarPorId(Integer idPromocion);
	public void eliminar(Integer idPromocion);
	public int numeroPromociones();
	Page<Promocion>buscarTodas(Pageable page);
}
