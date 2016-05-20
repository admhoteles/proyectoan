/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ufps.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ufps.edu.co.utils.conexion.clsConn;

/**
 *
 * @author EDINSON
 */
public class tipohabpropiedades {
     private clsConn cnn=new clsConn();

    public tipohabpropiedades() {
    
    }
    public String tipos(){
         ResultSet    msm= getCnn().consultaTabla("SELECT id_tipo, nombre From tiposhabitaciones;");
       String opcion=""; 
    try {
        while(msm.next()){
             opcion+="<option value=\""+msm.getInt(1)+"\">"+msm.getString(2)+"</option>"; 
       
        }
    } catch (SQLException ex) {
        Logger.getLogger(daohabitaciones.class.getName()).log(Level.SEVERE, null, ex);
    }
        return opcion;
    }
    public clsConn getCnn() {
        return cnn;
    }
     public String propiedades(){
         ResultSet    msm= getCnn().consultaTabla("SELECT id, descripcion From propiedades;");
       String opcion=""; 
       int i=0;
    try {
        while(msm.next()){
            System.out.println(i);
            opcion+="<input type=checkbox name="+msm.getInt(1)+" value="+msm.getInt(1)+">"+msm.getString(2)+"<br>";
       i++;
        }
    } catch (SQLException ex) {
        Logger.getLogger(daohabitaciones.class.getName()).log(Level.SEVERE, null, ex);
    }
    opcion+="<input type=hidden name=numcheck value="+i+" >";
        return opcion;
    }
   
}
