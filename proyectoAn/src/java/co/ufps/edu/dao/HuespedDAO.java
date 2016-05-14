/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ufps.edu.dao;
import co.ufps.edu.dto.Huesped;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ufps.edu.co.utils.conexion.Conexion;
/**
 *
 * @author macaco
 */
public class HuespedDAO {
    private Conexion conexion;
    
    //si no hay problema se retorna null si no se retorna un objeto
    public Huesped CreateHuesped(Huesped huesped){
        
       
		
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			
			if(conexion==null) 
                        conexion= new Conexion();
			if(conexion.getConnection()==null) 
                           con = conexion.conectar("");
			else con= conexion.getConnection();
                     
			String sql = "INSERT INTO huesped (cc, nombre, nacionalidad,procedencia)  "
					+    "values (?,?,?,?) ";
			ps = con.prepareStatement(sql);
			ps.setInt(1, huesped.getCc());
                        ps.setString(2, huesped.getNombre());
                        ps.setString(3, huesped.getNacionalidad());
                        ps.setString(4, huesped.getProcedencia());
			int consulta = ps.executeUpdate();
			
			if(consulta!=1){
                            huesped=null;
				
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
                return huesped;
        
    }
    
    
    public boolean validarExistencia(Huesped huesped){
       
		boolean var=true;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rst=null;
		try {
			
			if(conexion==null) conexion= new Conexion();
			if(conexion.getConnection()==null) con = conexion.conectar("");
			else con= conexion.getConnection();
			String sql = "SELECT * FROM huesped "
					+    "WHERE cc = ? ";
			ps = con.prepareStatement(sql);
			ps.setInt(1, huesped.getCc());
                       
			rst = ps.executeQuery();
			
			if(rst.next()){
				var=false;
			}
			
		} catch (Exception e) {
                    System.out.println("error "+e.toString());
			e.printStackTrace();
			conexion.escribirLogs("UsuarioDao", "registrarUsuario", e.toString());
                       
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
				conexion.escribirLogs("UsuarioDao", "registrarUsuario", e2.toString());
			}
						
			ps=null;
			con=null;
                        
		}
                return var;
        
    }
    
    public List<Huesped>ListarHuesped(){
        boolean var=true;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rst=null;
                List<Huesped>huespeds=new ArrayList<Huesped>();
                Huesped h ;
		try {
			
			if(conexion==null) conexion= new Conexion();
			if(conexion.getConnection()==null) con = conexion.conectar("");
			else con= conexion.getConnection();
			String sql = "SELECT * FROM huesped "
					;
			ps = con.prepareStatement(sql);
			
                       
			rst = ps.executeQuery();
			
			while(rst.next()){
				h = new Huesped();
                                h.setCc(rst.getInt("cc"));
                                h.setIdcliente(rst.getInt("idcliente"));
                                h.setNacionalidad(rst.getString("nacionalidad"));
                                h.setNombre(rst.getString("nombre"));
                                h.setProcedencia(rst.getString("procedencia"));
                                huespeds.add(h);
			
                        }
			
		} catch (Exception e) {
                    System.out.println("error "+e.toString());
			e.printStackTrace();
			conexion.escribirLogs("UsuarioDao", "registrarUsuario", e.toString());
                       
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
				conexion.escribirLogs("UsuarioDao", "registrarUsuario", e2.toString());
			}
						
			ps=null;
			con=null;
    }
                
                return huespeds;
    
}
      public List<Huesped>ListarHuespedPor(int cc){
        boolean var=true;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rst=null;
                List<Huesped>huespeds=new ArrayList<Huesped>();
                Huesped h ;
		try {
			
			if(conexion==null) conexion= new Conexion();
			if(conexion.getConnection()==null) con = conexion.conectar("");
			else con= conexion.getConnection();
			String sql = "SELECT * FROM huesped "
					+    "WHERE cc = ? ";
			ps = con.prepareStatement(sql);
                        ps.setInt(1,cc);
			
                       
			rst = ps.executeQuery();
			
			if(rst.next()){
				h = new Huesped();
                                h.setCc(rst.getInt("cc"));
                                h.setIdcliente(rst.getInt("idcliente"));
                                h.setNacionalidad(rst.getString("nacionalidad"));
                                h.setNombre(rst.getString("nombre"));
                                h.setProcedencia(rst.getString("procedencia"));
                                huespeds.add(h);
			
                        }
			
		} catch (Exception e) {
                    System.out.println("error "+e.toString());
			e.printStackTrace();
			conexion.escribirLogs("UsuarioDao", "registrarUsuario", e.toString());
                       
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
				conexion.escribirLogs("UsuarioDao", "registrarUsuario", e2.toString());
			}
						
			ps=null;
			con=null;
    }
                
                return huespeds;
    
}
    
}