package com.dsmc.persona.rowmap;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



import com.dsmc.persona.Persona;

public class PersonaRowMap implements RowMapper{
	public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
		Persona persona = new Persona();
		persona.setIdPersona(rs.getInt("ID_PERSONA"));
		persona.setNombre(rs.getString("nombre"));
		persona.setApPaterno(rs.getString("AP_PATERNO"));
		persona.setApMaterno(rs.getString("AP_MATERNO"));
		persona.setEdad(rs.getInt("edad"));
		persona.setTelefono(rs.getString("telefono"));
		return persona;
	}
}