package com.dsmc.dao;

import com.dsmc.entity.Alumnos;
import com.dsmc.persona.Persona;

import java.util.List;

public interface AlumnosDAO {
	
	void save(Alumnos alumnos);
	void delete(Integer id);
	void findAll();
	void findById(Integer id);
	void modify(String nombreAnterior,String nombreNuevo);
	void modify(Alumnos alumnos,Integer id);
	public List<Alumnos> getList();
	
}
