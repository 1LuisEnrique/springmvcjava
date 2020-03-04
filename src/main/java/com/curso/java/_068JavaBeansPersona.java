package com.curso.java;
/**
 * 
 * @author USUARIO
 * JavaNBeans: this class can to be use by other class 
 * without know to details the content of the class
 *Rules: 
 *1. it should have a constructor empty
 *2. The attributes should to be privates(encapsulation)
 *3. it going to Implement the interface serializable, this don´t have methods
 *    (the framework that we use can serialize our object) ones and ceros after apply the revers process
 */
public class _068JavaBeansPersona {
	private String name;
	private int age;
	
	public _068JavaBeansPersona() {
		
	}
	
	public _068JavaBeansPersona(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "_068JavaBeansPersona [name=" + name + ", age=" + age + "]";
	}
	
	
}
