package com.tiendaluci.tiendaluci.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.tiendaluci.tiendaluci.entity.Empleado;

public interface IntServiceEmpleados {
	public List<Empleado> obtenerEmpleado();
	public void guardar(Empleado empleado);
	public Empleado buscarPorId(Integer idEmpleado);
	public void eliminar(Integer idEmpleado);
	public int numeroEmpleado();
	Page<Empleado>buscarTodas(Pageable page);
}
