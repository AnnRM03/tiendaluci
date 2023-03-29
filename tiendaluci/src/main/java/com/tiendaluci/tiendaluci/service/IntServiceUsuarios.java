package com.tiendaluci.tiendaluci.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tiendaluci.tiendaluci.entity.Usuario;

public interface IntServiceUsuarios {
	public List<Usuario> obtnerUsuarios();
	public void agregar(Usuario usuario);
	public Usuario buscarPorId(Integer idUsuario);
	public void eliminar(Integer idUsuario);
	public long totalUsuarios();
	Page<Usuario>buscarTodas(Pageable page);

}
