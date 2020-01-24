package com.curso.java;

import java.util.Date;

public class _009HerenciaCliente extends _007HerenciaPersona{
	private int idCoustumer;
	private Date registerDate;
	private boolean vip;//Very Important Person
	private static int coustumerAccountant;
	
	public _009HerenciaCliente(Date registerDate, boolean vip) {
		this.idCoustumer = ++coustumerAccountant;
		this.registerDate = registerDate;
		this.vip = vip;
	}

	public int getIdCoustumer() {
		return idCoustumer;
	}

	
	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public static int getCoustumerAccountant() {
		return coustumerAccountant;
	}

	@Override
	public String toString() {
		return super.toString() + "_9HerenciaCliente [idCoustumer=" + idCoustumer + ", registerDate=" + registerDate + ", vip=" + vip
				+ "]";
	}
	
}
