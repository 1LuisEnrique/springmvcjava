package com.dsmc.persona.dao;

import java.util.List;

import com.dsmc.persona.Persona;

public interface PersonaDAO {
	
    void save(Persona persona);
	public List<Persona> getList();

}
