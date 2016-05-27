/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ufps.edu.dao;

import co.ufps.edu.dto.Servicios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ufps.edu.co.utils.conexion.clsConn;

/**
 *
 * @author EDINSON
 */
public class servicioDAO {
 private clsConn cnn=new clsConn();
    public servicioDAO() {
    }
    
 public String insertar (Servicios ser){
        String msm="";
       ResultSet res= getCnn().consultaTabla("select max(id)+1 from servicio;");
       int id=0; 
       try {
           if(res.next()){
               if(res.getInt(1)==0){
                    id=1;
                }else{
                id= res.getInt(1);}
           }
       } catch (SQLException ex) {
           Logger.getLogger(tipohabitaciondao.class.getName()).log(Level.SEVERE, null, ex);
       }
     getCnn().cerrar();
       String sql ="INSERT INTO servicio(id,id_hotel,nombre,precio) VALUES ("+id+",1,'"+ser.getNombre()+"',"+ser.getPrecio()+");";

      SQLException exe= getCnn().insertar(sql);
           getCnn().cerrar();
     System.out.println("insertar "+msm+"    ");
        return msm;
    }
     public String actualizar(Servicios ser){
     ResultSet    msm= getCnn().consultaTabla("SELECT * From servicio where id="+ser.getId()+";");
    try {
        while (msm.next()){
           
            if(ser.getNombre()==null){
                ser.setNombre(msm.getString(3));
            }
            if(ser.getPrecio()==0){
                ser.setPrecio(msm.getInt(4));
            }
        }   
         getCnn().cerrar();
        String sql="UPDATE servicio SET nombre="+ser.getNombre()+",precio="+ser.getPrecio()+" WHERE id_hab="+ser.getId()+";";
    int i=getCnn().actualizar(sql);
    } catch (SQLException ex) {
        Logger.getLogger(daohabitaciones.class.getName()).log(Level.SEVERE, null, ex);
        
    }
     getCnn().cerrar();
     return "";
     }
    
    public void eliminar(int id){
   int   msm= getCnn().verificar("DELETE FROM servicio WHERE id="+id+";");
     getCnn().cerrar();
    
 }
    public String tablaservicios() throws SQLException{
       String sql="select * from servicio;";
        ResultSet   msm= getCnn().consultaTabla(sql);
        
       String tabla="<div class=\"panel-footer table-responsive\"><table class=\"table table-striped\">\n" +
                            "<thead>\n" +
                               "<tr>\n" +
                                "<th class=\"col text-center\">Identificacion</th>\n" +
                                "<th class=\"col text-center\">Descripcion</th>\n" +
                                "<th class=\"col text-center\">Precio</th>\n" +
                                "<th class=\"col text-center\">Acciones</th>\n" +
                                "</tr>\n" +
                                   "\n" +"<tboby>";
       
       while(msm.next()){
                tabla+="<tr >";
                              tabla+="<td class=\"text-center\">"+msm.getInt(1)+"</td>";
                              tabla+="<td class=\"text-center\">"+msm.getString(3)+"</td>";
                              tabla+="<td class=\"text-center\">"+msm.getString(4)+"</td>";
                              tabla+="<td class=\"text-center\">"+"<form class=\"form-horizontal\" action=\"eliminar.jsp\" method=\"post\"><input type=\"hidden\" name=\"id\" value=\""+msm.getInt(1)+"\" ><input type=\"hidden\" name=\"tabla\" value=\"servicio\" ><button type=\"warning\" class=\"btn btn-danger btn-xs\"<a type=\"hidden\" onclick=\"return confirm('Seguro de eliminar?');\"></a>Eliminar</button></form>"
                                      +"<form class=\"form-horizontal\" action=\"editar_servicios.jsp\" method=\"post\"> <input type=\"hidden\" name=\"id\" value=\""+msm.getInt(1)+"\" ><input type=\"hidden\" name=\"tabla\" value=\"tiposhab\" ><button type=\"warning\" class=\"btn btn-warning btn-xs\">Editar</button></form>"+ "</td>";
          tabla+="</tr>";

            }
     
      
       tabla+="</tbody></table></div>";
        return (tabla);
   }
    public clsConn getCnn() {
        return cnn;
    }
}

