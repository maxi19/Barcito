package com.sample.core.domain;

public class Bebida extends GenericEntity implements Vendible {

	private int precio;
	private String titulo;
	private String descripcion;
	
	public Bebida(){
		
	}
	
	
	public Bebida(int id,int precio, String titulo) {
		super.setId(id);
		this.precio = precio;
		this.titulo = titulo;
	}
	
	
	public Bebida(int precio, String titulo) {
		super();
		this.precio = precio;
		this.titulo = titulo;
	}

	public int damePrecio() {
		return this.getPrecio();
	}


	public String dameTitulo() {
		// TODO Auto-generated method stub
		return this.getTitulo();
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


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
