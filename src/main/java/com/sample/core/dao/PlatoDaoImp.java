package com.sample.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sample.core.dao.config.Conexion;
import com.sample.core.domain.Plato;
import com.sample.core.exceptions.ErrorException;

public class PlatoDaoImp implements PlatoDao {

	
	private Conexion conexion = Conexion.getInstance();
	
	private static final String queryList = "SELECT id, precio, descripcion, titulo FROM plato";
	
	private static final String queryConsultarPLato = "SELECT id, precio, descripcion, titulo FROM plato where id=?";

	
	public List<Plato> list() throws Exception {
		 ResultSet rs = null;
		 List<Plato> platos = null;
		 Plato producto = null;
		 PreparedStatement st = null;
		 try{
			st = conexion.dameConnection().prepareStatement(queryList);
			rs = st.executeQuery();
			platos = new ArrayList<Plato>();
			 while (rs.next()) {
				 producto = new Plato(rs.getInt(1),rs.getInt(2), rs.getString(3));
				 platos.add(producto);
			}
				
		 }catch (Exception e) {
				throw new ErrorException("Hubo un error al realizar la consulta", e);
		}finally {
			try {
				st.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		 
		return platos;
	}

	
	public Plato findById(int id) throws Exception {
		 ResultSet rs = null;
		 PreparedStatement st = null;
		 try{
			st = conexion.dameConnection().prepareStatement(queryConsultarPLato);
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				return new Plato(rs.getInt(1), rs.getInt(2),rs.getString(3));
			}

		 }catch (Exception e) {
				throw new ErrorException("Hubo un error al realizar la consulta", e);
		}finally {
			try {
				st.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
	}


	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}


	public void save(String titulo, String descripcion, int precio) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
