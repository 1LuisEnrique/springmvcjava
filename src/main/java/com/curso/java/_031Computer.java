package com.curso.java;
/*
 * INTO LOG APLICATION
 * ssh gemapp@192.168.100.142
 * pw: itbm2019
 * ls
 * cd /
 * cd standalone/
 * cd log/
 * tail -f server.log
 * 
 * START BD
 * ssh db2inst1@192.168.100.142
 * pw: db2admin
 * db2start
 * */
public class _031Computer {
	private final int idComputer;
	private String name;
	private double price;
	private _030Monitor monitor;
	private _029Keyboard keyboard;
	private _028Mouse mouse;
	private static int accountantComputers;

	private _031Computer() {
		this.idComputer = ++accountantComputers;
	}

	public _031Computer(String name, double price,_030Monitor monitor, _029Keyboard keyboard, _028Mouse mouse) {
		this();
		this.name = name;
		this.price = price;
		this.monitor = monitor;
		this.keyboard = keyboard;
		this.mouse = mouse;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public _030Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(_030Monitor monitor) {
		this.monitor = monitor;
	}

	public _029Keyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(_029Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	public _028Mouse getMouse() {
		return mouse;
	}

	public void setMouse(_028Mouse mouse) {
		this.mouse = mouse;
	}

	public static int getAccountantComputers() {
		return accountantComputers;
	}

	@Override
	public String toString() {
		return "_031Computer [idComputer=" + idComputer + ", name=" + name + ", monitor=" + monitor + ", keyboard="
				+ keyboard + ", mouse=" + mouse + "]";
	}

}
