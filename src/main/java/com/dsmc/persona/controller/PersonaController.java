package com.dsmc.persona.controller;


import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dsmc.persona.Persona;
import com.dsmc.persona.dao.PersonaDAO;
import com.dsmc.persona.service.impl.PersonaImpl;

@Controller
public class PersonaController {
	@Autowired
	private PersonaDAO personaDAO;
	
	

	public PersonaDAO getPersonaDAO() {
		return personaDAO;
	}

	public void setPersonaDAO(PersonaDAO personaDAO) {
		this.personaDAO = personaDAO;
	}

	@RequestMapping(value= "/persona", method =RequestMethod.POST)
	public String addPersona(@ModelAttribute ("persona") Persona persona, BindingResult result) {
		personaDAO.save(persona);
		return "redirect:persona.html";
	}
	
	@RequestMapping("/persona")
	public ModelAndView showPersona(){
		System.out.println("entra a leer persona");
		return new ModelAndView("persona", "command", new Persona());
	}
	
	/*@RequestMapping("persona")
	public String listaPersona(Model model, Persona persona) {
		System.out.println("entra a coinsulta");
		model.addAttribute("command", persona);
		model.addAttribute("listPersona", personaImpl.getList());
		return "jsp/persona";
	}*/
	 @RequestMapping(value="consulta.html")
	    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	    	String now = (new Date()).toString();
	        //logger.info("Returning hello view with " + now);

	        Map<String, Object> myModel = new HashMap<String, Object>();
	        myModel.put("now", now);
	        myModel.put("listaPersonas", this.personaDAO.getList());

	        return new ModelAndView("consulta", "model", myModel);
	    }

}
