/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import Negocio.ContorladorHuesped;
import co.ufps.edu.dto.Huesped;
import java.util.List;

/**
 *
 * @author macaco
 */
public class ControladorNegocio {
    private ContorladorHuesped contorladorH;

    public ControladorNegocio() {
        
        contorladorH= new ContorladorHuesped();
        
    }
    
    public List<Huesped> listarUsuario(){
        return contorladorH.listarHuesped();
    }
     public List<Huesped> listarUsuariopor(int cc){
        return contorladorH.listarHuespedpor(cc);
    }
    
     
     public Huesped registrarH(Huesped h){
         return contorladorH.RegistrarHuesped(h);
     }
    
}
