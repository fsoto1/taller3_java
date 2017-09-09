/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buenasalud;

import java.util.Date;

/**
 *
 * @author Franco
 */
public class ReservaPagoHora {
    private int folio;
    private String fecha;
    private String rut_doctor;
    private String rut_paciente;
    private String nombre_paciente;
    private String fecha_pago;
    private int valor_atencion;
    private String observacion;
    
    /**
     * Constructor
     * @param folio
     * @param fecha
     * @param rut_doctor
     * @param rut_paciente
     * @param nombre_paciente
     * @param fecha_pago
     * @param valor_atencion
     * @param observacion 
     */
    public ReservaPagoHora(int folio, String fecha, String rut_doctor, String rut_paciente, String nombre_paciente, String fecha_pago, int valor_atencion, String observacion){
        this.folio = folio;
        this.fecha = fecha;
        this.rut_doctor = rut_doctor;
        this.rut_paciente = rut_paciente;
        this.nombre_paciente = nombre_paciente;
        this.fecha_pago = fecha_pago;
        this.valor_atencion = valor_atencion;
        this.observacion = observacion;
    }
    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the rut_doctor
     */
    public String getRut_doctor() {
        return rut_doctor;
    }

    /**
     * @param rut_doctor the rut_doctor to set
     */
    public void setRut_doctor(String rut_doctor) {
        this.rut_doctor = rut_doctor;
    }

    /**
     * @return the rut_paciente
     */
    public String getRut_paciente() {
        return rut_paciente;
    }

    /**
     * @param rut_paciente the rut_paciente to set
     */
    public void setRut_paciente(String rut_paciente) {
        this.rut_paciente = rut_paciente;
    }

    /**
     * @return the nombre_paciente
     */
    public String getNombre_paciente() {
        return nombre_paciente;
    }

    /**
     * @param nombre_paciente the nombre_paciente to set
     */
    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    /**
     * @return the fecha_pago
     */
    public String getFecha_pago() {
        return fecha_pago;
    }

    /**
     * @param fecha_pago the fecha_pago to set
     */
    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    /**
     * @return the valor_atencion
     */
    public int getValor_atencion() {
        return valor_atencion;
    }

    /**
     * @param valor_atencion the valor_atencion to set
     */
    public void setValor_atencion(int valor_atencion) {
        this.valor_atencion = valor_atencion;
    }

    /**
     * @return the observacion
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * @param observacion the observacion to set
     */
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    
    
}
