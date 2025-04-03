package com.sample.core.domain;

import java.util.ArrayList;
import java.util.List;

public class Mesa {

	private int id;

	private List<Pedible> pedidos = new ArrayList<Pedible>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public void agregarPedible(Pedible pedible){
		this.pedidos.add(pedible);
	}
	
	
	
}
