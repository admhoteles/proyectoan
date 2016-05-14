/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import ufps.edu.co.utils.conexion.Conexion;
import dto.principal;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkgMenu.clsConn;

/**
 *
 * @author EDINSON
 */
public class datoshoteldao  {
  
private clsConn cnn=new clsConn();
    public datoshoteldao()  {
      
    }
    
    public void agregar(principal p) throws SQLException{
     if(estavacio()==true){
         System.out.println("esta vacido");
         ingresar(p);
         
     }
     else{
           System.out.println("esta lleno");
         actualizar(p);
     }
        }
    public boolean  estavacio(){
       String sql="SELECT * From hotel;";
if (    getCnn().verificar(sql) == -1){
 System.err.print(getCnn().verificar(sql) );
return true;}
return false; 
    }
    
    public void ingresar(principal p){
        String sql ="INSERT INTO hotel VALUES ('"+p.getNombre()+"','"+ p.getSlogan()+"','"+ p.getDir()+"',"+p.getTel()+","+p.getCel()+","+1+");";
        
       SQLException exe= getCnn().insertar(sql);

    }
    public void actualizar(principal p){
        String sql ="UPDATE hotel SET Nombre='"+p.getNombre()+"',Slogan='"+ p.getSlogan()+"',Direccion='"+ p.getDir()+"',telefono="+p.getTel()+",celular="+p.getCel()+",id="+1+"WHERE id=1;";
 

       int exe= getCnn().actualizar(sql);
       System.out.println("final :" +exe);
       
    }
    
     public clsConn getCnn() {
        return cnn;
    }
       
       
      
       
     
    }
     /*    public void insert(principal p) {
       String result= null;
             System.err.println("entro a insertar");
       String sql="INSERT INTO hotel (Nombre, Slogan, Direccion, telefono,celular,id) VALUES (?,?,?,?,?,?);";
        try {
            Connection cn = c.conectar("xd");
            PreparedStatement ps= cn.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getSlogan());
            ps.setString(3, p.getDir());
            ps.setInt(4,p.getTel());
            ps.setInt(5,p.getCel());
            ps.setInt(6, 1);
            ps.executeUpdate();            
            ps.close();cn.close();
            
        } catch (Exception e) {
            System.out.println("Error:  " + e.getMessage());
            result = e.getMessage();
        }
        
    }
    public void update(principal p) {
        String result= null;
        System.err.println("entro a actualizar");
        String sql ="UPDATE hotel SET Nombre=?, Slogan=?, Direccion=?, telefono=?, celular=? WHERE id=1;";

        try {
            Connection cn = c.conectar("xd");
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getSlogan());
            ps.setString(3, p.getDir());
            ps.setInt(4,p.getTel());
            ps.setInt(5,p.getCel());
            ps.executeUpdate();
            cn.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
      
    }     */
        
    
    
 
