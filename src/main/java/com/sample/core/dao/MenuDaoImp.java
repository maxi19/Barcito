package com.sample.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sample.core.dao.config.Conexion;
import com.sample.core.domain.Menu;
import com.sample.core.domain.Plato;
import com.sample.core.exceptions.ErrorException;

public class MenuDaoImp implements MenuDao {

	private FactoryDao factoryDao = new FactoryDaoImp();
	
	private static final String queryList = "SELECT id, Precio, Descripcion, idPlato,idBebida,idPostre,tipo FROM menus";

	private Conexion conexion = Conexion.getInstance();

	public List<Menu> listarMenu() throws Exception {

		 ResultSet rs = null;
		 List<Menu> menus = null;
		 Menu unMenu = null;
		 PreparedStatement st = null;
		 try{
			st = conexion.dameConnection().prepareStatement(queryList);
			rs = st.executeQuery();
			menus = new ArrayList<Menu>();
			 while (rs.next()) {
				 unMenu = new Menu();
				 unMenu.setId(rs.getInt(1));
				 unMenu.setPrecio(rs.getInt(1));
				 unMenu.setDescripcion(rs.getString(3));
				 menus.add(unMenu);
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
		 
		return menus;
	}

	public void addMenu(Menu menu) throws Exception {
		
		
		
		
		
		
	}

}
