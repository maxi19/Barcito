package com.sample.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.sample.core.dao.config.Conexion;
import com.sample.core.domain.Postre;

public class PostreDaoImp implements PostreDao{

	private static final String queryList = "SELECT id, titulo, descripcion, precio FROM postre";
	
	private static final String queryConsultarPostre = "SELECT id, Precio, Descripcion FROM bebida where id=?";

	private static final String queryAddPostre = "INSERT INTO postre ( titulo, descripcion, precio) VALUES (?,?,?)";

	private Conexion conexion = Conexion.getInstance();

	
	public List<Postre> list() throws Exception {
		PreparedStatement st= null;
		ResultSet rs = null;
		List<Postre> postres = new ArrayList<Postre>();

		try {
			st = conexion.dameConnection().prepareStatement(queryList);
			rs = st.executeQuery();
			
			while (rs.next()) {
				postres.add(new Postre(rs.getInt(1),rs.getString(2),rs.getInt(4),rs.getString(3)));
			}
			
		} catch (Exception e) {
			System.out.println(e.getCause());
		}finally {
			st.close();
			rs.close();
			
		}
		
		return postres;
	}

	public Postre findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(String titulo, String descripcion, int precio) throws Exception {

	PreparedStatement st = conexion.dameConnection().prepareStatement(queryAddPostre);
		st.setInt(1, precio);
		st.setString(2, descripcion);
		st.setString(3, titulo);
		st.executeQuery();
		finalizarConexion(st);
	}

	
	private void finalizarConexion(PreparedStatement st, ResultSet rs) {
		try {
			if(st != null)st.close();
			if(rs != null)rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void finalizarConexion(PreparedStatement st) {
		try {
			if(st != null)st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
