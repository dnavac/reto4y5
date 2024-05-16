package com.example.demo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private int REGIdentifica;
	private String REGNombres;
	private String REGApellidos;
	private String REGCorreo;
	private int REGMovil;
	private String REGDireccion;
	private String REGMunicipio;

	public int getREGIdentifica() {
		return REGIdentifica;
	}

	public void setREGIdentifica(int rEGIdentifica) {
		REGIdentifica = rEGIdentifica;
	}

	public String getREGNombres() {
		return REGNombres;
	}

	public void setREGNombres(String rEGNombres) {
		REGNombres = rEGNombres;
	}

	public String getREGApellidos() {
		return REGApellidos;
	}

	public void setREGApellidos(String rEGApellidos) {
		REGApellidos = rEGApellidos;
	}

	public String getREGCorreo() {
		return REGCorreo;
	}

	public void setREGCorreo(String rEGCorreo) {
		REGCorreo = rEGCorreo;
	}

	public int getREGMovil() {
		return REGMovil;
	}

	public void setREGMovil(int rEGMovil) {
		REGMovil = rEGMovil;
	}

	public String getREGDireccion() {
		return REGDireccion;
	}

	public void setREGDireccion(String rEGDireccion) {
		REGDireccion = rEGDireccion;
	}

	public String getREGMunicipio() {
		return REGMunicipio;
	}

	public void setREGMunicipio(String rEGMunicipio) {
		REGMunicipio = rEGMunicipio;
	}

	@Override
	public String toString() {
		return "Persons [REGIdentifica=" + REGIdentifica + ", REGNombres=" + REGNombres + ", REGApellidos="
				+ REGApellidos + ", REGCorreo=" + REGCorreo + ", RegMobile=" + REGMovil + ", REGMovil=" + REGDireccion
				+ ", REGDireccion=" + REGMunicipio + " ]";
	}

}
