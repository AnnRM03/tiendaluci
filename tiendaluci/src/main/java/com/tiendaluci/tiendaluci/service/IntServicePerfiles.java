package com.tiendaluci.tiendaluci.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tiendaluci.tiendaluci.entity.Perfil;

public interface IntServicePerfiles {

	public List<Perfil> obtnerPerfiles();
	public void agregarPerfil(Perfil perfil);
	public Perfil buscarPorId(Integer idPerfil);
	public void eliminarPerfil(Integer idPerfil);
	public long totalPerfiles();
	Page<Perfil>buscarTodas(Pageable page);
}
