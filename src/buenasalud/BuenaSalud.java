/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buenasalud;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Franco & Hugo
 */
public class BuenaSalud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <Doctor> doctor = new ArrayList<>();
        List <ReservaPagoHora> reserva = new ArrayList<>();
        int opcion;
        String joption;
        String lista;
        Boolean loop = true;
        Boolean encontrado;
        String rut;
        String nombre;
        String especialidad;
        int valor_atencion = 0;
        int folio;
        String fecha;
        String rut_paciente;
        String nombre_paciente;
        String fecha_pago;
        String observacion;
        /*
        *******Datos*********
        doctor.add(new Doctor("1", "Hugo", "cardio", 1));
        doctor.add(new Doctor("2", "Franco", "d", 2));
        doctor.add(new Doctor("3", "LELE", "l", 3));
        reserva.add(new ReservaPagoHora(1, "1 sep", "1", "44", "PA1", null, 1, "obs"));
        reserva.add(new ReservaPagoHora(2, "12 sep", "1", "44", "PA2", "1 sep", 1, "obs"));
        reserva.add(new ReservaPagoHora(3, "13 sep", "1", "44", "PA3", "1 sep", 1, "obs"));
        reserva.add(new ReservaPagoHora(4, "14 sep", "2", "44", "PA4", "1 sep", 1, "obs"));
        */
        while(loop){
            joption =JOptionPane.showInputDialog("Menu\n"
                    + "1) Ingresar Doctor\n"
                    + "2) Consultar Doctor\n"
                    + "3) Listar Doctor\n"
                    + "4) Actualizar Doctor\n"
                    + "5) Reserva de hora del paciente\n"
                    + "6) Pago de reserva de hora del paciente\n"
                    + "7) Listar reservas por Doctor\n"
                    + "8) Listar Pagos por Doctor\n"
                    + "9) Listar Ingresos por días\n"
                    + "10) Salir");
            if (joption == null ) {
                    loop = false;
            }
            try{
                opcion = Integer.parseInt(joption);
                if (opcion == 10) {
                    loop = false;
                }
                if (opcion == 1) {
                    rut = JOptionPane.showInputDialog("Rut");
                    nombre = JOptionPane.showInputDialog("Nombre");
                    especialidad = JOptionPane.showInputDialog("Especialidad");
                    valor_atencion = Integer.parseInt(JOptionPane.showInputDialog("Valor atencion"));
                    doctor.add(new Doctor( rut, nombre, especialidad, valor_atencion));
                    JOptionPane.showMessageDialog(null, "Ingresado Doctor:\n"
                            + "\nRut: "+rut
                            + "\nNombre: "+nombre
                            + "\nEspecialidad: "+especialidad
                            + "\nValor atencion: "+valor_atencion
                    );
                }
                if (opcion == 2) {
                    encontrado = false;
                    nombre = JOptionPane.showInputDialog("Ingrese Nombre de Doctor");
                    for (int i = 0; i < doctor.size(); i++) {
                        if (nombre.equals(doctor.get(i).getNombre())) {
                            JOptionPane.showMessageDialog(null, "Doctor encontrado:\n"
                            + "\nRut: "+doctor.get(i).getRut()
                            + "\nNombre: "+doctor.get(i).getNombre()
                            + "\nEspecialidad: "+doctor.get(i).getEspecialidad()
                            + "\nValor atencion: "+doctor.get(i).getValor_atencion()
                            );
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "Doctor no encontrado\n");
                    }
                }
                
                if (opcion == 3) {
                    lista= "";
                    for (int i = 0; i < doctor.size(); i++) {
                        lista += "Doctor nº"+(i+1)+" | Rut: "+doctor.get(i).getRut()+" ";
                        lista += "| Nombre: "+doctor.get(i).getNombre()+" ";
                        lista += "| Especialidad: "+doctor.get(i).getEspecialidad()+" ";
                        lista += "| Valor: "+doctor.get(i).getValor_atencion()+"\n";
                        
                        
                    }
                    JOptionPane.showMessageDialog(null, lista );
                }
                if (opcion == 4) {
                    encontrado = false;
                    nombre = JOptionPane.showInputDialog("Ingrese Nombre de Doctor a actualizar");
                    for (int i = 0; i < doctor.size(); i++) {
                        if (nombre.equals(doctor.get(i).getNombre())) {
                            JOptionPane.showMessageDialog(null, "Doctor encontrado:\n");
                            encontrado = true;
                            rut = JOptionPane.showInputDialog("Actualizar Rut");
                            nombre = JOptionPane.showInputDialog("Actualizar Nombre");
                            especialidad = JOptionPane.showInputDialog("Actualizar Especialidad");
                            valor_atencion = Integer.parseInt(JOptionPane.showInputDialog("Actualizar Valor atencion"));
                            doctor.get(i).setRut(rut);
                            doctor.get(i).setNombre(nombre);
                            doctor.get(i).setEspecialidad(especialidad);
                            doctor.get(i).setValor_atencion(valor_atencion);
                            
                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "Doctor no encontrado:\n");
                    }
                }
                if (opcion == 5) {
                    encontrado = false;
                    rut = JOptionPane.showInputDialog("Ingrese Rut de Doctor");
                    for (int i = 0; i < doctor.size(); i++) {
                        if (rut.equals(doctor.get(i).getRut())) {
                            JOptionPane.showMessageDialog(null, "Doctor encontrado:\n");
                            encontrado = true;
                            valor_atencion = doctor.get(i).getValor_atencion();                           
                        }
                    }
                    if (encontrado) {
                        folio = Integer.parseInt(JOptionPane.showInputDialog("Folio paciente"));
                        rut_paciente = JOptionPane.showInputDialog("Rut paciente");
                        nombre_paciente = JOptionPane.showInputDialog("Nombre paciente");
                        fecha = JOptionPane.showInputDialog("Fecha reserva");
                        observacion = JOptionPane.showInputDialog("Observacion");
                        reserva.add(new ReservaPagoHora(folio, fecha, rut, rut_paciente, nombre_paciente, null, valor_atencion, observacion));
                    }else{
                        JOptionPane.showMessageDialog(null, "Doctor no encontrado\n");
                    }
                }                
                if (opcion == 6) {
                    encontrado = false;
                    folio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Folio a pagar:"));
                    for (int i = 0; i < reserva.size(); i++) {
                        if (folio == reserva.get(i).getFolio()) {
                           fecha_pago =  JOptionPane.showInputDialog("Folio encontrado:\n"
                                    + "Ingrese fecha de pago");
                           reserva.get(i).setFecha_pago(fecha_pago);
                           encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "Folio no encontrado\n");
                    }
                }
                if (opcion == 7) {
                    rut = JOptionPane.showInputDialog("Ingrese Rut del Doctor:");
                    lista= "";
                    for (int i = 0; i < reserva.size(); i++) {
                        if (rut.equals(reserva.get(i).getRut_doctor())) {
                            lista += "Nombre paciente: "+reserva.get(i).getNombre_paciente()+" ";
                            lista += "| Rut paciente: "+reserva.get(i).getRut_paciente()+" ";
                            lista += "| Fecha de reserva: "+reserva.get(i).getFecha()+" ";
                            lista += "| Valor: "+reserva.get(i).getValor_atencion()+" ";
                            lista += "| Observacion: "+reserva.get(i).getObservacion()+"\n";  
                        }                                 
                    }
                    JOptionPane.showMessageDialog(null, lista );
                }
                if (opcion == 8) {
                    rut = JOptionPane.showInputDialog("Ingrese Rut del Doctor:");
                    lista= "";
                    for (int i = 0; i < reserva.size(); i++) {
                        if (rut.equals(reserva.get(i).getRut_doctor()) && reserva.get(i).getFecha_pago() != null) {
                            lista += "Nombre paciente: "+reserva.get(i).getNombre_paciente()+" ";
                            lista += "| Rut paciente: "+reserva.get(i).getRut_paciente()+" ";
                            lista += "| Fecha de reserva: "+reserva.get(i).getFecha()+" ";
                            lista += "| Fecha de pago: "+reserva.get(i).getFecha_pago()+" ";
                            lista += "| Valor: "+reserva.get(i).getValor_atencion()+" ";
                            lista += "| Observacion: "+reserva.get(i).getObservacion()+"\n";  
                        }                                 
                    }
                    JOptionPane.showMessageDialog(null, lista );
                }
                if (opcion == 9) {
                    fecha = JOptionPane.showInputDialog("Ingrese Fecha a consultar:");
                    lista= "";
                    for (int i = 0; i < reserva.size(); i++) {
                        if (fecha.equals(reserva.get(i).getFecha())) {
                            lista += "Rut Doctor: "+reserva.get(i).getRut_doctor()+" ";
                            lista += "| Nombre paciente: "+reserva.get(i).getNombre_paciente()+" ";
                            lista += "| Rut paciente: "+reserva.get(i).getRut_paciente()+" ";
                            lista += "| Fecha de reserva: "+reserva.get(i).getFecha()+" ";
                            lista += "| Fecha de pago: "+reserva.get(i).getFecha_pago()+" ";
                            lista += "| Valor: "+reserva.get(i).getValor_atencion()+" ";
                            lista += "| Observacion: "+reserva.get(i).getObservacion()+"\n";  
                        }                                 
                    }
                    JOptionPane.showMessageDialog(null, lista );
                }

            }catch(Exception e){
                System.err.println("Error");
            }  
        }
    }
}
