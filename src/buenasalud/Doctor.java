/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buenasalud;

/**
 *
 * @author Franco
 */
public class Doctor {
    private String rut;
    private String nombre;
    private String especialidad;
    private int valor_atencion;
    
    /**
     * Contructor de la clase
     * @param rut
     * @param nombre
     * @param especialidad
     * @param valor_atencion 
     */
    public Doctor(String rut, String nombre, String especialidad, int valor_atencion){
        this.rut = rut;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.valor_atencion = valor_atencion;
    }
    
    /**
     * @return the rut
     */
    public String getRut() {
        return rut;
    }

    /**
     * @param rut the rut to set
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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
}
