package com.sample.core.controller.plato;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.core.dao.config.Conexion;
import com.sample.core.service.PlatoService;
import com.sample.core.service.PlatoServiceImpl;

@WebServlet( urlPatterns =  "/PlatoEliminar")
public class PlatoEliminar extends HttpServlet {
	
	PlatoService platoService = new PlatoServiceImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Obtener datos del formulario en index
		// dentro de getParameter, cada parametro debe ser igual a los atributos "name"
		// de las etiquetas input del formulario
		String id = req.getParameter("id");
		
		
		// Ver datos recibidos del formulario en pantalla de Eclipse
		
		System.out.println("id: " + id);
		
        // Validar que la descripción no esté vacía
        if (id == null || id.trim().isEmpty()) {
            req.setAttribute("mensajeError", "Error: La descripción no puede estar vacía.");
            req.getRequestDispatcher("/loadPlatoFormBaja").forward(req, resp);
            return;     
        }
        
        int idInt = Integer.parseInt(id);
        try {
			platoService.delete(idInt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		/*
		try (Connection connnection = Conexion.dameConnection()) {
			String sql = "DELETE FROM plato WHERE idPlato = ?";
			try (PreparedStatement statement = connnection.prepareStatement(sql)) {
				statement.setString(1, id);


				int filasAfectadas = statement.executeUpdate();
				if (filasAfectadas > 0) {
					req.setAttribute("mensajeExito", "¡Datos eliminados correctamente!");
					req.getRequestDispatcher("/loadPlatoForm").forward(req, resp); // Redirige de
					// éxito
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		*/	
	}
}
