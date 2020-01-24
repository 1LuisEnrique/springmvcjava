package com.dsmc.persona.dao;

import java.util.List;

import com.dsmc.persona.Persona;

public interface PersonaDAO {
	
	public void save(Persona persona);
	public List<Persona> getList();

}
