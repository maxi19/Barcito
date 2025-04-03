package com.sample.core.domain;

import java.util.List;

public class Ticket {

	private List<Vendible> vendibles;
	private String empresa;
	private String cuit;
	

	 public Ticket( List<Vendible> vendibles, String empresam, String cuit  ) {
		 this.vendibles = vendibles;
	}

	public List<Vendible> getVendibles() {
		return vendibles;
	}

	public void setVendibles(List<Vendible> vendibles) {
		this.vendibles = vendibles;
	}

	public String getEmpresa() {
		return empresa;
	}



	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	
	public void immprimir() {
		int total = 0;
		
		for (Vendible vendible : vendibles) {
			
			System.out.println(" descripcion " + vendible.dameTitulo()   );
			total = total + vendible.damePrecio();
			
			System.out.println(" $ " + vendible.damePrecio());
			
		}
		
		System.out.println( "el total es "+ total );
		
		
		
	}
	
	
	
	
	
	
}
