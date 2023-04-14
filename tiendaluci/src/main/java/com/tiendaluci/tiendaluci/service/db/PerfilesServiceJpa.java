package com.tiendaluci.tiendaluci.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tiendaluci.tiendaluci.entity.Perfil;
import com.tiendaluci.tiendaluci.repository.PerfilesRepository;
import com.tiendaluci.tiendaluci.service.IntServicePerfiles;

@Service
@Primary
public class PerfilesServiceJpa implements IntServicePerfiles {

	@Autowired
	private PerfilesRepository repoPerfiles;
	
	@Override
	public List<Perfil> obtnerPerfiles() {
		// TODO Auto-generated method stub
		return repoPerfiles.findAll();
	}

	@Override
	public void agregarPerfil(Perfil perfil) {
		// TODO Auto-generated method stub
		repoPerfiles.save(perfil);
	}

	@Override
	public Perfil buscarPorId(Integer idPerfil) {
		Optional<Perfil> optional = repoPerfiles.findById(idPerfil);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void eliminarPerfil(Integer idPerfil) {
		// TODO Auto-generated method stub
		repoPerfiles.deleteById(idPerfil);
	}

	@Override
	public long totalPerfiles() {
		// TODO Auto-generated method stub
		return repoPerfiles.count();
	}

	@Override
	public Page<Perfil> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return repoPerfiles.findAll(page);
	}

}
