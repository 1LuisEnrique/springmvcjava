package com.dsmc.persona.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dsmc.persona.service.impl.PersonaImpl;

public class PersonaControllerQuery {
	@Autowired
	private PersonaImpl personaImpl;

	public void setPersonaImpl(PersonaImpl personaImpl) {
		this.personaImpl = personaImpl;
	}
	@RequestMapping(value="/consulta")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		Map<String , Object> map = new HashMap<String, Object>();
		map.put("listaPersonas", personaImpl.getList());
		return new ModelAndView("consulta", "model", map);
	}
}
