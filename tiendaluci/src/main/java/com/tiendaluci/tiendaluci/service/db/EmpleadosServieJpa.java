package com.tiendaluci.tiendaluci.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.tiendaluci.tiendaluci.entity.Empleado;
import com.tiendaluci.tiendaluci.repository.EmpleadosRepository;
import com.tiendaluci.tiendaluci.service.IntServiceEmpleados;

@Service
@Primary
public class EmpleadosServieJpa implements IntServiceEmpleados {

	@Autowired
	private EmpleadosRepository repoEmpleados;
	
	@Override
	public List<Empleado> obtenerEmpleado() {
		// TODO Auto-generated method stub
		return repoEmpleados.findAll();
	}

	@Override
	public void guardar(Empleado empleado) {
		// TODO Auto-generated method stub
		repoEmpleados.save(empleado);
	}

	@Override
	public Empleado buscarPorId(Integer idEmpleado) {
		Optional<Empleado> optional = repoEmpleados.findById(idEmpleado);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void eliminar(Integer idEmpleado) {
		// TODO Auto-generated method stub
		repoEmpleados.deleteById(idEmpleado);
	}

	@Override
	public int numeroEmpleado() {
		// TODO Auto-generated method stub
		return (int) repoEmpleados.count();
	}

	@Override
	public Page<Empleado> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return repoEmpleados.findAll(page);
	}

}
