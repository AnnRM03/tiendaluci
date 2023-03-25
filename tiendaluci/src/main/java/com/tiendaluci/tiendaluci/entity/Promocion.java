package com.tiendaluci.tiendaluci.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Promocion")
public class Promocion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id_prom;
	private String nombre;
	private String detalle;
	private String descripcion;
	private LocalDate fecha_inicio=LocalDate.now();
	private LocalDate fecha_final=LocalDate.now();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getId_prom() {
		return id_prom;
	}
	public void setId_prom(Integer id_prom) {
		this.id_prom = id_prom;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDate getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(LocalDate fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public LocalDate getFecha_final() {
		return fecha_final;
	}
	public void setFecha_final(LocalDate fecha_final) {
		this.fecha_final = fecha_final;
	}
	@Override
	public String toString() {
		return "Promocion [id_prom=" + id_prom + ", nombre=" + nombre + ", detalle=" + detalle + ", descripcion="
				+ descripcion + ", fecha_inicio=" + fecha_inicio + ", fecha_final=" + fecha_final + "]";
	}
}
