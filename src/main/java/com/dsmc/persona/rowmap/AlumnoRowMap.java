package com.dsmc.persona.rowmap;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dsmc.entity.Alumnos;
import com.dsmc.persona.Persona;

public class AlumnoRowMap implements RowMapper{
	public Alumnos mapRow(ResultSet rs, int rowNum) throws SQLException {
		Alumnos alumno = new Alumnos();
		alumno.setId(rs.getInt("id"));
		alumno.setNombre(rs.getString("nombre"));
		alumno.setApPaterno(rs.getString("AP_PATERNO"));
		alumno.setApMaterno(rs.getString("AP_MATERNO"));
		alumno.setEdad(rs.getInt("edad"));
		alumno.setCarrera(rs.getString("carrera"));
		alumno.setPasatiempo(rs.getString("PASATIEMPO"));
		
		return alumno;
	}
}
