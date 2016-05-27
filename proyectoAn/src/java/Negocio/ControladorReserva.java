/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import co.ufps.edu.dao.ReservaDAO;
import co.ufps.edu.dto.Reserva;

/**
 *
 * @author macaco
 */
public class ControladorReserva {
    private ReservaDAO reserva;
    
    public ControladorReserva(){
        reserva= new ReservaDAO();
        
    }
    
    public Reserva createReserva(Reserva r){
        return reserva.crearReserva(r);
    }
    public Reserva listarReservaporhuesped(int numh){
        return reserva.ListarReservaPorHuesped(numh);
    }
    
}
