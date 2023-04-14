package com.tiendaluci.tiendaluci.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tiendaluci.tiendaluci.entity.Promocion;
import com.tiendaluci.tiendaluci.repository.PromocionesRepository;
import com.tiendaluci.tiendaluci.service.IntServicePromociones;

@Service
@Primary
public class PromocionesServiceJpa implements IntServicePromociones {

	@Autowired      
	private PromocionesRepository repoPromociones;
	
	@Override
	public List<Promocion> obtenerPromociones() {
		// TODO Auto-generated method stub
		return repoPromociones.findAll();
	}

	@Override
	public void guardar(Promocion promocion) {
		// TODO Auto-generated method stub
		repoPromociones.save(promocion);
	}

	@Override
	public Promocion buscarPorId(Integer idPromocion) {
		Optional<Promocion> optional = repoPromociones.findById(idPromocion);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void eliminar(Integer idPromocion) {
		// TODO Auto-generated method stub
		repoPromociones.deleteById(idPromocion);
	}

	@Override
	public int numeroPromociones() {
		// TODO Auto-generated method stub
		return (int) repoPromociones.count();
	}

	@Override
	public Page<Promocion> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return repoPromociones.findAll(page);
	}

}
