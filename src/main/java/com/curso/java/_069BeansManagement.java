package com.curso.java;

public class _069BeansManagement {
	public static void main(String[] args) {
		_068JavaBeansPersona bean = new _068JavaBeansPersona();
		bean.setName("Luis");
		bean.setAge(23);
		
		System.out.println(bean.getName());
		System.out.println(bean.getAge());
		
		_068JavaBeansPersona bean1 = new _068JavaBeansPersona("Dany", 21);
		System.out.println(bean1);
	}
}
