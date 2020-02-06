package com.curso.java;

public class _030Monitor {
	private final int idMonitor;
	private String brand;
	private double size;
	private static int accountMonitors;

	public _030Monitor() {
		this.idMonitor = ++accountMonitors;
	}

	public _030Monitor(String brand, double size) {
		this();
		this.brand = brand;
		this.size = size;
	}

	public int getIdMonitor() {
		return idMonitor;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public static int getAccountMonitors() {
		return accountMonitors;
	}

	@Override
	public String toString() {
		return "_030Monitor [idMonitor=" + idMonitor + ", brand=" + brand + ", size=" + size + "]";
	}

}
