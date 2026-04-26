package com.sample.core.dao.config;
 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Conexion {
	
	private static final Logger log = Logger.getLogger(Conexion.class
			.getPackage().getName());
	
	private static final String HOST = "db";
	private static final String URL = "jdbc:mysql://"+HOST+":3306";
	private static final String DBNAME = "barcitodb";
	
	
	private static final String TIMEZONE = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
				
	private static final String USUARIO = "root";
	private static final String PASSWORD = "admin";
	

	private static Conexion instance = Conexion.getInstance();
	 
	private Connection conn;
	
	private Conexion() {}
	
	public Connection dameConnection() throws Exception{
		
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL+"/"+ DBNAME, USUARIO, PASSWORD);
			if (!conn.isClosed()) {
				
				//log.info("conectado a la base de datos");
			}	
			return conn;
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			throw new Exception("no se pudo conectar a la base" + e.getMessage());
		} catch (Exception e) {
			throw new Exception("no se pudo conectar a la base" + e.getMessage());
		}
		return null;
	}
	
	 public static Conexion getInstance() {
	       if (instance == null) {
	    	   instance = new Conexion();
	       }
	       return instance;
	   }

	 
}
