package com.sample.core.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( urlPatterns =  "/formulario")
public class LoadForm extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static String PLATO_FORM ="plato/platoForm.jsp";

	private static String BEBIDA_FORM ="bebida/BebidaForm.jsp";

	private static String POSTRE_FORM ="postre/postreForm.jsp";

	private static String MENU_FORM ="menu/menuForm.jsp";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		if (req.getParameter("form").equals("platoform")) {
			req.getRequestDispatcher(PLATO_FORM).forward(req, resp);
		}else if(req.getParameter("form").equals("bebidaForm")){
			req.getRequestDispatcher(BEBIDA_FORM).forward(req, resp);
		}else if (req.getParameter("form").equals("postreForm")) {
			req.getRequestDispatcher(POSTRE_FORM).forward(req, resp);
		}else if(req.getParameter("form").equals("menuForm")) {
			req.getRequestDispatcher(MENU_FORM).forward(req, resp);
		}else {
			req.getRequestDispatcher("").forward(req, resp);
		}
	}
	
}
