package com.dsmc.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dsmc.dao.AlumnosDAO;
import com.dsmc.entity.Alumnos;
import com.dsmc.persona.dao.PersonaDAO;
import com.dsmc.service.AlumnoService;

@Controller
@SessionAttributes
public class AlumnosController {
	@Autowired
	private AlumnoService alumnosService;

	@Autowired
	private AlumnosDAO alumnosDAO;

	@RequestMapping("/alumno")
	public ModelAndView showAlumno() {
		System.out.println("entra a leer Alumnos");
		return new ModelAndView("alumno", "command", new Alumnos());
	}

	@RequestMapping(value = "/alumno", method = RequestMethod.POST)
	public String addAlumno(@ModelAttribute("alumno") Alumnos alumno, BindingResult result) {
		alumnosService.save(alumno);
		return "redirect:alumno.html";
	}

	@RequestMapping(value = "consultaAlumnos.html")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String now = (new Date()).toString();
		// logger.info("Returning hello view with " + now);

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", now);
		myModel.put("listaAlumnos", this.alumnosDAO.getList());

		return new ModelAndView("consultaAlumnos", "model", myModel);
	}

	@RequestMapping(value = "/modificaAlumnos", method = RequestMethod.POST)
	public String addAlumno1(@ModelAttribute("modificaAlumnos") Alumnos alumno, BindingResult result) {
		alumnosService.modify(alumno, 1);
		return "redirect:modificaAlumnos.html";
	}
	
	@RequestMapping("/modificaAlumnos")
	public ModelAndView showAlumno3() {
		System.out.println("entra a modificar");
		return new ModelAndView("modificaAlumnos", "command", new Alumnos());
	}
	@RequestMapping("/eliminaAlumno")
	public ModelAndView showAlumno2() {
		System.out.println("entra a leer Alumnos");
		return new ModelAndView("eliminaAlumno", "command", new Alumnos());
	}

	@RequestMapping(value = "/eliminaAlumno", method = RequestMethod.POST)
	public String addAlumno2(@ModelAttribute("eliminaAlumno") Alumnos alumno, BindingResult result, Integer id) {
		alumnosService.delete(id);
		return "redirect:eliminaAlumno.html";
	}

}
