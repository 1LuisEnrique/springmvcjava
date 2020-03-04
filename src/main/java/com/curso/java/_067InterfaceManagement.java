package com.curso.java;

import abstracto.domain._064InterfacesAccesoDatos;

public class _067InterfaceManagement {
	public static void main(String[] args) {
		_064InterfacesAccesoDatos datos = new _065InterfacesImplementationOracle();
		datos.insert();
		datos = new _066InterfacesImplementationMySql();
		datos.insert();
		datos.list();
		
		System.out.println(_064InterfacesAccesoDatos.ROW_MAX);
		
	}
}
