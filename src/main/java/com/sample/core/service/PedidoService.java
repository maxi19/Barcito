package com.sample.core.service;

import java.util.List;

import com.sample.core.domain.Mesa;
import com.sample.core.domain.Pedido;
import com.sample.core.enums.PedidoEnum;

public interface PedidoService {

	Pedido findByIdAndState(int id, PedidoEnum pedidoEnum) throws Exception;
	
	
	
}
