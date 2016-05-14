/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ufps.edu.dao;

import co.ufps.edu.dto.habitaciones;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ufps.edu.co.utils.conexion.clsConn;


/**
 *
 * @author EDINSON
 */
public class daohabitaciones {
    
int id;
int tipo;
int estado;
String foto;
private clsConn cnn=new clsConn();

        

    public daohabitaciones() {
    
    }

    public daohabitaciones(int id, int tipo, int estado, String foto) {
        this.id = id;
        this.tipo = tipo;
        this.estado = estado;
        this.foto = foto;
    }
    
    public String insertar (habitaciones h){
        String msm="";
        if(disponible(h.getId())){
             String sql ="INSERT INTO habitaciones VALUES (1,"+h.getId()+","+ h.getTipo()+","+ h.getEstado()+",'"+h.getFoto()+"');";
        
       SQLException exe= getCnn().insertar(sql);
            msm=exe.getMessage();
        }else{
            return "Error en la id de la habitacion, posiblemente repetida";
        }
        return msm;
    }
    
     public boolean  disponible(int id){
       String sql="SELECT * From habitaciones where id_hab="+id+";";
if (    getCnn().verificar(sql) == -1){
 System.err.print(getCnn().verificar(sql) );
return true;}
return false; 
    }
     
     public String actualizar(habitaciones h){
     ResultSet    msm= getCnn().consultaTabla("SELECT * From habitaciones where id_hab="+h.getId()+";");
    try {
        while (msm.next()){
            if(h.getTipo()==0){
                h.setTipo(msm.getInt(3));
            }
            if(h.getEstado()==0){
                h.setEstado(msm.getInt(4));
            }
            if(h.getFoto()==null){
                h.setFoto(msm.getString(5));
            }
        }   } catch (SQLException ex) {
        Logger.getLogger(daohabitaciones.class.getName()).log(Level.SEVERE, null, ex);
    }
     return "";
     }
     
    public String habitaciones() throws SQLException{
        String sql="select h.id_hab, t.nombre,e.descripcion from habitaciones h inner join tiposhabitaciones  t on( h.tipo= t.id_tipo) inner join  estadohabitacion e on (h.estado = e.id);";
        ResultSet   msm= getCnn().consultaTabla(sql);
        
       String tabla="<div class=\"panel-footer table-responsive\"><table class=\"table table-striped\">\n" +
                            "<thead>\n" +
                               "<tr>\n" +
                                "<th class=\"col text-center\">Identificacion</th>\n" +
                                "<th class=\"col text-center\">Tipo de habitacion</th>\n" +
                                "<th class=\"col text-center\">Estado</th>\n" +
                                "<th class=\"col text-center\">Acciones</th>\n" +
                                "</tr>\n" +
                                   "\n" +"<tboby>";
       
       while(msm.next()){
                tabla+="<tr class=\"success\">";
                              tabla+="<td class=\"warning text-center\">"+msm.getInt(1)+"</td>";
                              tabla+="<td class=\"warning text-center\">"+msm.getString(2)+"</td>";
                              tabla+="<td class=\"warning text-center\">"+msm.getString(3)+"</td>";
                              tabla+="<td class=\"warning text-center\">"+"<form class=\"form-horizontal\" action=\"eliminar.jsp\" method=\"post\"><input type=\"hidden\" name=\"id\" value=\""+msm.getInt(1)+"\" ><input type=\"hidden\" name=\"tabla\" value=\"habitaciones\" ><button type=\"warning\" class=\"btn btn-danger\">Eliminar</button>"
                                      +"<form class=\"form-horizontal\" action=\"editar.jsp\" method=\"post\"><input type=\"hidden\" name=\"id\" value=\""+msm.getInt(1)+"\" ><input type=\"hidden\" name=\"tabla\" value=\"habitaciones\" ><button type=\"warning\" class=\"btn btn-warning\">Editar</button>"+ "</td>";
          tabla+="</tr>";

            }
     
      
       tabla+="</tbody></table></div>";
        return (tabla);
    }
           
 public clsConn getCnn() {
        return cnn;
    }
 public void eliminar(){
     System.out.println("esta en eliminar");
     JOptionPane.showMessageDialog(null, "esta en eliminar");
 }
  public static void main(String []args) throws SQLException{
        
       habitaciones h=new habitaciones(1,1,1,"holaaaaaa");
       daohabitaciones d= new daohabitaciones();
       d.habitaciones();
       
       
   }
}
