/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pepo
 */
public class PersonaService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String FORMATO_FECHA = "dd/MM/yyyy";
    public Persona crearPersona(){
        
        System.out.println("Ingrese su nombre completo");
        String nombre = leer.next();
        
        Date fechaNacimiento = null;
        boolean fechaValida = false;
        while (!fechaValida) {            
            System.out.println("Ingrese su fecha de nacimiento (dia/mes/año)");
            String fechaNacimientoStr = leer.next();  
            SimpleDateFormat formatoFecha = new SimpleDateFormat(FORMATO_FECHA);
            try {
                fechaNacimiento = formatoFecha.parse(fechaNacimientoStr);
                fechaValida = true;
            } catch (ParseException e) {
                System.out.println("Formato de fecha incorrecto. Vuelva a intentar.");
            }
        }    
        
        Persona persona = new Persona(nombre, fechaNacimiento);
        return persona;
    }
    
    public static int calcularEdad(Persona a){
        Date fechaNacimiento = a.getFechaDeNacimiento();
        LocalDate fechaNacimientoLocal = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaActual = LocalDate.now();
        
        Period periodo = Period.between(fechaNacimientoLocal, fechaActual);
            
        return periodo.getYears();
    }
    
   public static boolean menorQue(Persona a, int edad){
       int edadPersona = calcularEdad(a);
    
       return edadPersona < edad ;
   }
   
   
   public static void mostrar(Persona a){
       System.out.println("Su nombre completo es: "+a.getNombre()+" y tiene: "+ calcularEdad(a)+" años");
   } 
    
}
