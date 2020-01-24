package com.dsmc.service;

import java.util.List;

import com.dsmc.entity.Alumnos;

public interface AlumnoService {
	void save(Alumnos alumnos);
	void delete(Integer id);
	void findAll();
	void findById(Integer id);
	void modify(Alumnos alumnos,Integer id);
	public List<Alumnos> getList();
}
