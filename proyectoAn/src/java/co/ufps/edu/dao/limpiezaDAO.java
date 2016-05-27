/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ufps.edu.dao;

import co.ufps.edu.dto.limpieza;
import java.sql.ResultSet;
import java.sql.SQLException;
import ufps.edu.co.utils.conexion.clsConn;

/**
 *
 * @author EDINSON
 */
public class limpiezaDAO {
    
private clsConn cnn=new clsConn();

    public limpiezaDAO() {
    }

   
    
     public String insertar (limpieza lim){
        String msm="Dureante el ingreso ocurrio un problema";
       
       
     getCnn().cerrar();
       String sql ="INSERT INTO servicioaseo(id_hab, id_emp)VALUES ("+lim.getId_hab()+","+lim.getId_emp()+");";

      SQLException exe= getCnn().insertar(sql);
         
          if(exe==null){
              msm= "Ingreso exitoso";
          }
     System.out.println("insertar "+msm+"    ");
      getCnn().cerrar();
        return msm;
    }
    /*
   public String todaspropiedades() throws SQLException{
       String sql="select * from propiedades;";
        ResultSet   msm= getCnn().consultaTabla(sql);
        
       String tabla="<div class=\"panel-footer table-responsive\"><table class=\"table table-striped\">\n" +
                            "<thead>\n" +
                               "<tr>\n" +
                                "<th class=\"col text-center\">Identificacion</th>\n" +
                                "<th class=\"col text-center\">Nombre de la propiedad</th>\n" +
                                "<th class=\"col text-center\">Incremento</th>\n" +
                                "<th class=\"col text-center\">Acciones</th>\n" +
                                "</tr>\n" +
                                   "\n" +"<tboby>";
       
       while(msm.next()){
                tabla+="<tr >";
                              tabla+="<td class=\"text-center\">"+msm.getInt(1)+"</td>";
                              tabla+="<td class=\"text-center\">"+msm.getString(2)+"</td>";
                              tabla+="<td class=\"text-center\">"+msm.getString(3)+"</td>";
                              tabla+="<td class=\"text-center\">"+"<form class=\"form-horizontal\" action=\"eliminar.jsp\" method=\"post\"><input type=\"hidden\" name=\"id\" value=\""+msm.getInt(1)+"\" ><input type=\"hidden\" name=\"tabla\" value=\"prophab\" ><button type=\"warning\" class=\"btn btn-danger btn-xs\"<a type=\"hidden\" onclick=\"return confirm('Seguro de eliminar?');\"></a>Eliminar</button></form>"
                                      +"<form class=\"form-horizontal\" action=\"editarpropiedadeshab.jsp\" method=\"post\"> <input type=\"hidden\" name=\"id\" value=\""+msm.getInt(1)+"\" ><input type=\"hidden\" name=\"name\" value=\""+msm.getString(2)+"\" ><button type=\"warning\" class=\"btn btn-warning btn-xs\">Editar</button></form>"+ "</td>";
          tabla+="</tr>";

            }
     
      
       tabla+="</tbody></table></div>";
        getCnn().cerrar();
        return (tabla);
   } */
    
    public clsConn getCnn() {
        return cnn;
    }/*
      public void eliminar(int id){
   int   msm= getCnn().verificar("DELETE FROM propiedades WHERE id="+id+";");
     getCnn().cerrar();
    
 }
      public String actualizar(propiedadeshab proph){
     ResultSet    msm= getCnn().consultaTabla("SELECT * From propiedades where id_hab="+proph.getId()+";");
    try {
        while (msm.next()){
            if(proph.getInc()==0){
               proph.setInc(msm.getInt(3));
            }
            if(proph.getDescripcion()==null){
                proph.setDescripcion(msm.getString(2));
            }
        }   
         getCnn().cerrar();
        String sql="UPDATE propiedades SET descripcion="+proph.getDescripcion()+", incremento="+proph.getInc()+" WHERE id_hab="+proph.getId()+";";
    int i=getCnn().actualizar(sql);
    } catch (SQLException ex) {
        Logger.getLogger(daohabitaciones.class.getName()).log(Level.SEVERE, null, ex);
        
    }
     getCnn().cerrar();
     return "";
     }*/
}

