package com.dsmc.persona.service.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dsmc.persona.Persona;
import com.dsmc.persona.dao.PersonaDAO;

import com.dsmc.persona.rowmap.PersonaRowMap;

public class PersonaImpl implements PersonaDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void save(Persona persona) {
		System.out.println("Nombre: " + persona.getNombre() + "A. Paterno: " + persona.getApPaterno() + "A. Materno: "
				+ persona.getApMaterno() + "Edad: " + persona.getEdad() + "Telefono: " + persona.getTelefono());

		try {
			String sql = "insert into persona (NOMBRE, AP_PATERNO, AP_MATERNO, EDAD, TELEFONO) values(?,?,?,?,?)";

			jdbcTemplate.update(sql, new Object[] { persona.getNombre(), persona.getApPaterno(), persona.getApMaterno(),
					persona.getEdad(), persona.getTelefono() });
		} catch (Exception e) {
			System.out.println("error al insetar en tabla persona: " + e.getMessage());
		}

	}

	public List<Persona> getList() {
		String sql = "SELECT id, " + "       nombre," + "       ap_Paterno," + "       ap_Materno," + "       edad,"
				+ "       telefono" + " FROM PERSONA";
		List<Persona> listPersona = jdbcTemplate.query(sql, new PersonaRowMap());
		System.out.println(listPersona);
		return listPersona;
	}
	
}
