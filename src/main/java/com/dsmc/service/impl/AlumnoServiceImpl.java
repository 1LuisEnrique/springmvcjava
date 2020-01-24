package com.dsmc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.dsmc.dao.AlumnosDAO;
import com.dsmc.entity.Alumnos;
import com.dsmc.persona.Persona;
import com.dsmc.persona.rowmap.PersonaRowMap;
import com.dsmc.service.AlumnoService;

@Service(value = "alumnoService")
public class AlumnoServiceImpl implements AlumnoService {
	@Autowired
	private AlumnosDAO alumnoDAO;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save(Alumnos alumnos) {
		// TODO Auto-generated method stub
		alumnoDAO.save(alumnos);

	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		alumnoDAO.delete(id);
	}

	public void findAll() {
		// TODO Auto-generated method stub
		alumnoDAO.findAll(); 
	}

	public void findById(Integer id) {
		// TODO Auto-generated method stub

	}

	
	public void modify(Alumnos alumnos, Integer id) {
		// TODO Auto-generated method stub
		
	}

	public List<Alumnos> getList() {
		String sql = "SELECT id, " + "       nombre," + "       ap_Paterno," + "       ap_Materno," + "       edad,"
				+ "       carrera," + "		PASATIEMPO" + " FROM ALUMNO";
		List<Alumnos> listAlumno = jdbcTemplate.query(sql, new PersonaRowMap());
		System.out.println(listAlumno);
		return listAlumno;
	}

}
