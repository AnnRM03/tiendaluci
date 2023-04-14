package com.tiendaluci.tiendaluci.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tiendaluci.tiendaluci.entity.Empleado;

public class EmpleadosServiceImp implements IntServiceEmpleados {

	private List<Empleado> empleados = null;
	
	@Override
	public List<Empleado> obtenerEmpleado() {
		// TODO Auto-generated method stub
		return empleados;
	}

	@Override
	public void guardar(Empleado empleado) {
		// TODO Auto-generated method stub
		empleados.add(empleado);
	}

	@Override
	public Empleado buscarPorId(Integer idEmpleado) {
		for(Empleado emp : empleados) {
			if(emp.getId_emp().compareTo(idEmpleado) == 0) {
				return emp;
			}
		}
		return null;
	}

	@Override
	public void eliminar(Integer idEmpleado) {
		// TODO Auto-generated method stub
		empleados.remove(buscarPorId(idEmpleado));
	}

	@Override
	public int numeroEmpleado() {
		// TODO Auto-generated method stub
		return empleados.size();
	}

	@Override
	public Page<Empleado> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

}
