package com.tiendaluci.tiendaluci.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tiendaluci.tiendaluci.entity.Promocion;

public class PromocionesServiceImp implements IntServicePromociones {
	
	private List<Promocion> promociones = null;

	@Override
	public List<Promocion> obtenerPromociones() {
		// TODO Auto-generated method stub
		return promociones;
	}

	@Override
	public void guardar(Promocion promocion) {
		// TODO Auto-generated method stub
		promociones.add(promocion);
	}

	@Override
	public Promocion buscarPorId(Integer idPromocion) {
		for(Promocion prom : promociones) {
			if(prom.getId_prom().compareTo(idPromocion) == 0) {
				return prom;
			}
		}
		return null;
	}

	@Override
	public void eliminar(Integer idPromocion) {
		// TODO Auto-generated method stub
		promociones.remove(buscarPorId(idPromocion));
	}

	@Override
	public int numeroPromociones() {
		// TODO Auto-generated method stub
		return promociones.size();
	}

	@Override
	public Page<Promocion> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

}
