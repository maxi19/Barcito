package com.sample.core.controller.pedido;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sample.core.domain.Pedido;
import com.sample.core.service.PedidoService;
import com.sample.core.service.PedidoServiceImp;

@WebServlet( urlPatterns =  "/persistirPerdido")
public class PedidoSession extends HttpServlet{

	PedidoService pedidoService = new PedidoServiceImp();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession misession= req.getSession(true);	
		//si no existe un pedido en session se crea uno, si existe es por que esta agregando pedibles
	    Pedido pedido =	(Pedido) misession.getAttribute("pedido");
		
	    if (pedido != null) {
			
	    	
	    	
	    	
	    	
		}else {
			String idmesa = req.getParameter("idMesa");
			int IdMesaInt  = Integer.parseInt(idmesa);
			Pedido pèdidoNuevo = new Pedido();
			pèdidoNuevo.setIdMesa(IdMesaInt);
			misession.setAttribute("pedido", pèdidoNuevo);
		}
		
		
		
	}

	
	
	
	
}
