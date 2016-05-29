/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ufps.edu.dao;

import co.ufps.edu.dto.Cliente;
import co.ufps.edu.dto.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import ufps.edu.co.utils.conexion.Conexion;

/**
 *
 * @author macaco
 */
public class ItemDao {
    private Conexion conexion;
    
     public Item CreateItem(Item item){
        
       
		
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			
			if(conexion==null) 
                        conexion= new Conexion();
			if(conexion.getConnection()==null) 
                           con = conexion.conectar("");
			else con= conexion.getConnection();
                      
                     
			String sql = "INSERT INTO item (id_ser,id_cliente, id_reserva,cantidad)"
                               
					+    "values (?,?,?,?) ";
                        
                        
			ps = con.prepareStatement(sql);
                        
                      
                    ps.setInt(1, item.getIdser());
                    ps.setInt(2, item.getId_cliente());
                    ps.setInt(3, item.getId_reserva());
                    ps.setInt(4, item.getCantidad());
                    
                     
                    
                    
                    

                    
			
			int consulta = ps.executeUpdate();
			
			if(consulta!=1){
                            item=null;
				
			}
			
		} catch (Exception e) {
                    System.out.println("error "+e.toString());
			e.printStackTrace();
			
                       
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
				
			}
						
			ps=null;
			con=null;
		}
                return item;
        
    }
    
}
