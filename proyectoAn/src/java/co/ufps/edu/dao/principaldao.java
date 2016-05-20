package co.ufps.edu.dao;

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
import ufps.edu.co.utils.conexion.clsConn;

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
    private clsConn cnn=new clsConn();

    public principaldao()   {
  
      
       
    }
   
    
    public principal consultardatos() throws SQLException{
        this.con = c.conectar("");
        
        String resultado="";
       String sql;
   System.err.println("holaaaaaaaaaa");
        sql="SELECT * FROM hotel";
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
       return p; 
    } 
    public String habitacionesMostrar(){
        String m="";
      String  sql1="select tipo, foto from habitaciones group by tipo,foto; ";
    int preciob=0;
    String caracteristicas="";
    int valor=0;
    String tip="";
    System.out.println("metoooodo");
    ArrayList<Integer> tipo= new ArrayList<Integer>();
        try {
        ResultSet rs1=getCnn().consultaTabla(sql1);
           
            while(rs1.next()){
                if(!tipo.contains(rs1.getInt(1))){
                    tipo.add(rs1.getInt(1));
                    System.out.println("ciclo1");
                    String  sql2="select nombre,preciobase from tiposhabitaciones where id_tipo="+rs1.getInt(1)+"; ";
                      ResultSet rs2 =getCnn().consultaTabla(sql2);
                      while(rs2.next()){
                          tip=rs2.getString(1);
                          preciob=rs2.getInt(2);
                    System.out.println("ciclo2");
                      }
                      
                      String  sql3="select ph.descripcion,ph.incremento from propiedadesportipo p join propiedades ph on(p.id_descripcion=ph.id) where p.id_tipo="+rs1.getInt(1)+"; ";
                      ResultSet rs3 =getCnn().consultaTabla(sql3);
                      while(rs3.next()){
                          caracteristicas+=rs3.getString(1)+", ";
                          valor+=preciob*rs3.getInt(2)/100;
                          System.out.print(caracteristicas+" cara");
                      }
                      valor+=preciob;
                    m+=" <li><a href=\"#\"><img src=\""+rs1.getString(2)+"\" alt=\"\" title=\"\" class=\"property_img\"/></a>";
					m+="<span class=\"price\">$"+valor+"</span>";
					m+="<div class=\"property_details\">";
						m+="<h1><a>Clase "+tip+"</a></h1>";
						m+="<h2>"+caracteristicas+"<span class=\"property_size\"></span></h2></div></li>";
		caracteristicas="";
                }
            }
            
    } catch (SQLException ex) {
            Logger.getLogger(principaldao.class.getName()).log(Level.SEVERE, null, ex);
        }
        getCnn().cerrar();
    return m;
}
     public clsConn getCnn() {
        return cnn;
    }
}