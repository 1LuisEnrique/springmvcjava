package com.curso.java;

import abstracto.domain._064InterfacesAccesoDatos;

public class _066InterfacesImplementationMySql implements _064InterfacesAccesoDatos{
	
	public void insert() {
		System.out.println("Insert since MySql");
	}
	
	public void list() {
		System.out.println("List since MySql");
	}
}
