package com.dsmc.entity;
public class Alumnos {
	private int id;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private int edad;
	private String carrera;
	private String pasatiempo;

	public String getPasatiempo() {
		return pasatiempo;
	}
	public void setPasatiempo(String pasatiempo) {
		this.pasatiempo = pasatiempo;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApPaterno() {
		return apPaterno;
	}
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
	public String getApMaterno() {
		return apMaterno;
	}
	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}
