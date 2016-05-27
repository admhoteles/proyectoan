/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ufps.edu.dao;
import co.ufps.edu.dto.Huesped;
import co.ufps.edu.dto.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import ufps.edu.co.utils.conexion.Conexion;
/**
 *
 * @author macaco
 */
public class ReservaDAO {
    
    private Conexion conexion;
     public Reserva crearReserva(Reserva reserva){
        
       SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		
		Connection con=null;
		PreparedStatement ps=null;
               java.sql.Timestamp fecha = new java.sql.Timestamp(reserva.getFechainicio().getTime().getTime());

		
		try {
			
			if(conexion==null) 
                        conexion= new Conexion();
			if(conexion.getConnection()==null) 
                           con = conexion.conectar("");
			else con= conexion.getConnection();
                     
			String sql = "INSERT INTO reserva (id_cliente, fechainicial, fechafin,id_hab,estado)  "
					+    "values (?,?,?,?,?) ";
			ps = con.prepareStatement(sql);
			ps.setInt(1, reserva.getId_cliente());
                        //ps.setString(2, sdf.format(reserva.getFechainicio().getTime()));
                        ps.setTimestamp(2, fecha);
                        ps.setTimestamp(3, fecha);
                        ps.setInt(4,reserva.getId_hab());
                        ps.setInt(5, reserva.getEstado());
                        
			int consulta = ps.executeUpdate();
			//consulta tablas que se actualizaron 
			if(consulta!=1){
                            reserva=null;
				
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
                return reserva;
        
    }
     /*JOIN
     
     SELECT huesped.cedula
FROM huesped
INNER JOIN reserva
ON huesped.id=reserva.id_cliente where huesped.cedula=123456789
     **/
     
      public Reserva ListarReservaPorHuesped(int cedulaHuesped){
      
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rst=null;
                Calendar fechainicio= new GregorianCalendar();
                Calendar fechafin=new GregorianCalendar();
                
               Reserva r=new Reserva() ;
		try {
			
			if(conexion==null) conexion= new Conexion();
			if(conexion.getConnection()==null) con = conexion.conectar("");
			else con= conexion.getConnection();
			String sql = "SELECT reserva.id,reserva.id_cliente,"
                                + "reserva.fechafin,reserva.fechainicial,reserva.id_hab,"
                                + "reserva.estado"
                                 +"FROM huesped" +
                                "INNER JOIN reserva" +
                                "ON huesped.id=reserva.id_cliente where huesped.cedula=? and estado=1";
			ps = con.prepareStatement(sql);
                        ps.setInt(1,cedulaHuesped);
			
                       
			rst = ps.executeQuery();
			
			if(rst.next()){
				
                                r.setEstado(rst.getInt("estado"));
                                r.setId(rst.getInt("id"));
                                //asi parseamos la fecha de  tiemstamp a Calendar nota: los milisegundos no pasan todos
                             fechainicio.setTimeInMillis(rst.getTimestamp("fechainicial").getTime());
                             fechafin.setTimeInMillis(rst.getTimestamp("fechafin").getTime());
                             
                             r.setFechainicio(fechainicio);
                             r.setFechafin(fechafin);
                             
                             r.setId_cliente(rst.getInt("id_cliente"));
                              r.setId_cliente(rst.getInt("id_hab"));
                              
                               
			
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
                
                return r;
    
}
    
    
}