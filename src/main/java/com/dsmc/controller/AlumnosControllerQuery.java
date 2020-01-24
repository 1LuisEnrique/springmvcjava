package com.dsmc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dsmc.dao.impl.AlumnosDAOImp;
import com.dsmc.persona.service.impl.PersonaImpl;
import com.dsmc.service.impl.AlumnoServiceImpl;
@Controller
@SessionAttributes
public class AlumnosControllerQuery {
	@Autowired
	private AlumnoServiceImpl alumnoServiceImpl;

	public void setPersonaImpl(AlumnoServiceImpl alumnoServiceImpl) {
		this.alumnoServiceImpl = alumnoServiceImpl;
	}
	
	@RequestMapping(value="/consultaAlumnos")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		Map<String , Object> map = new HashMap<String, Object>();
		map.put("listaAlumnos", alumnoServiceImpl.getList());
		return new ModelAndView("consultaAlumnos", "model", map);
	}
	
}
