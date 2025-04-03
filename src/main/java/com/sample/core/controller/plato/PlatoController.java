package com.sample.core.controller.plato;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.core.dao.config.Conexion;
import com.sample.core.service.PlatoService;
import com.sample.core.service.PlatoServiceImpl;

@WebServlet( urlPatterns =  "/CrearPlato")
public class PlatoController extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PlatoService platoservice = new PlatoServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Obtener datos del formulario en index
		// dentro de getParameter, cada parametro debe ser igual a los atributos "name"
		// de las etiquetas input del formulario
		String titulo = req.getParameter("titulo");
		String descripcion = req.getParameter("descripcion");
		String precioString = req.getParameter("precio");
		int precioInt = 0;
		
		
		// Ver datos recibidos del formulario en pantalla de Eclipse
		
		System.out.println("precio: " + precioString);
		System.out.println("descripcion: " + descripcion);
		
		
		// Controlar que no hayan llegado datos vacios
		//if (precioString == null || precioString.trim().isEmpty()||descripcion == null || descripcion.trim().isEmpty()) {
        //    req.setAttribute("mensajeError", "Error: La descripción no puede estar vacía.");
        //    req.getRequestDispatcher("/loadPlatoForm").forward(req, resp);
         //   return;     
       // }
		
		precioInt = Integer.parseInt(precioString);
		
		try {
			platoservice.crearPlato(titulo,descripcion, precioInt);
			//req.getRequestDispatcher("/LeerDatosPlato").forward(req, resp);
			resp.sendRedirect("/LeerDatosPlato");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		
		try (Connection connnection = Conexion.dameConnection()) {
			String sql = "INSERT INTO Plato (precio, descripcion) VALUES (?,? )";
			try (PreparedStatement statement = connnection.prepareStatement(sql)) {
				statement.setInt(1, precioInt);
				statement.setString(2, descripcion);


				int filasAfectadas = statement.executeUpdate();
				if (filasAfectadas > 0) {
					req.setAttribute("mensajeExito", "¡Datos guardados correctamente!");
					req.getRequestDispatcher("/loadPlatoForm").forward(req, resp); // Redirige de
					// éxito
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}	*/
	}
}
