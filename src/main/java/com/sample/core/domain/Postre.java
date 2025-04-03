package com.sample.core.domain;

public class Postre extends GenericEntity implements  Pedible{

	private int precio;
	
	private String titulo;
	
	
	
	
	public Postre(int precio, String titulo) {
		super();
		this.precio = precio;
		this.titulo = titulo;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
	public int damePrecio() {
		return this.getPrecio();
	}
	
	public String dameTitulo() {
		return this.getTitulo();
	}
	
	
	
}
