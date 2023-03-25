package com.tiendaluci.tiendaluci.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id_emp;
	private String nombre;
	private String a_paterno;
	private String a_materno;
	private String correo;
	private String num_tel;
	private String cargo;
	private Integer edad;
	private String sexo;
	public Integer getId_emp() {
		return id_emp;
	}
	public void setId_emp(Integer id_emp) {
		this.id_emp = id_emp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getA_paterno() {
		return a_paterno;
	}
	public void setA_paterno(String a_paterno) {
		this.a_paterno = a_paterno;
	}
	public String getA_materno() {
		return a_materno;
	}
	public void setA_materno(String a_materno) {
		this.a_materno = a_materno;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNum_tel() {
		return num_tel;
	}
	public void setNum_tel(String num_tel) {
		this.num_tel = num_tel;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Empleado [id_emp=" + id_emp + ", nombre=" + nombre + ", a_paterno=" + a_paterno + ", a_materno="
				+ a_materno + ", correo=" + correo + ", num_tel=" + num_tel + ", cargo=" + cargo + ", edad=" + edad
				+ ", sexo=" + sexo + "]";
	}

}
