/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pepo
 */
public class FechaService {
    Scanner leer = new Scanner(System.in);   
    public Date fechaNacimiento (){
        System.out.println("Ingrese su fecha de nacimiento(dia/mes/año)");
        String input = leer.nextLine();
        String[] partes = input.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]) - 1;
        int anio = Integer.parseInt(partes[2]) - 1900;
        Date fecha = new Date(anio,mes,dia);
        
        
        return new Date(anio,mes,dia);
    }
    
    public Date fechaActual  (){
        
        return new Date();
    }
    
    public int diferencia (Date fecha,Date fechaActual){
        long diferenciaMS = fechaActual.getTime() - fecha.getTime();
        long msPorAnio = 1000L * 60 * 60 * 24 * 365;
        
        return (int)(diferenciaMS / msPorAnio);
    }
            
            
}
