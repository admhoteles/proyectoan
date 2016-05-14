package dao;

import co.ufps.edu.dto.habitaciones;
import co.ufps.edu.dto.principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ufps.edu.co.utils.conexion.Conexion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edinson
 */
public class principaldao {
    private Conexion c=new Conexion();
    private Connection con;
    private ResultSet rs;
    private PreparedStatement ps;

    public principaldao()   {
  
      
       
    }
   
    
    public String consultardatos() throws SQLException{
        this.con = c.conectar("");
        
        String resultado="";
       String sql;
   System.err.println("holaaaaaaaaaa");
        sql="SELECT * FROM datos";
   principal p=new principal();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.err.println("holaaaaaaaaaa");
            while(rs.next()){
                p.setNombre(rs.getString(1));
                p.setSlogan(rs.getString(2));
               p.setDir(rs.getString(3));
               p.setTel(rs.getInt(4));
               p.setCel(rs.getInt(5));
                
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(principaldao.class.getName()).log(Level.SEVERE, null, ex);
        }
         c.cerrarConexion();
       /*
        metodo para buscar las habitaciones por tipo 
        */ 
   /*  sql="select detalles, precio, tipo, capacidad from habitaciones group by detalles,precio, capacidad,tipo; ";
    this.con = c.conectar("xd");
       ArrayList hab= new ArrayList();
        try {
            System.err.println("22222");
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
           habitaciones h;
            while(rs.next()){
            h= new habitaciones(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7));
            System.err.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)+rs.getInt(4)+rs.getString(5)+rs.getString(6)+rs.getString(7));
            
            System.err.println("holaaaaaaaaaa");



 hab.add(h);
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(principaldao.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    //   p.setHab(hab);
     //   c.cerrarConexion();
       return p.toString(); 
    } 
    
}
