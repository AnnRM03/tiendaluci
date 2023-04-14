package com.tiendaluci.tiendaluci.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id_cat;
	private String nombre;
	private String detalles;
	public Integer getId_cat() {
		return id_cat;
	}
	public void setId_cat(Integer id_cat) {
		this.id_cat = id_cat;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDetalles() {
		return detalles;
	}
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	@Override
	public String toString() {
		return "Categoria [id_cat=" + id_cat + ", nombre=" + nombre + ", detalles=" + detalles + "]";
	}
	
	
	
}
