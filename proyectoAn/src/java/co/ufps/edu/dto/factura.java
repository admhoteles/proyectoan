/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ufps.edu.dto;

import java.sql.Date;


public class factura {
    /**
     idfactura serial NOT NULL,
  descripccion character varying(255) NOT NULL,
  fechagenerada date,
  idasignada integer NOT NULL,
     
     */
    
    
    private int serial;
    private String descripccion;
    private Date fechagenerada;
    private int idasginada;

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    public Date getFechagenerada() {
        return fechagenerada;
    }

    public void setFechagenerada(Date fechagenerada) {
        this.fechagenerada = fechagenerada;
    }

    public int getIdasginada() {
        return idasginada;
    }

    public void setIdasginada(int idasginada) {
        this.idasginada = idasginada;
    }
    
}
