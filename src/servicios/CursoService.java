/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Pepo
 */
public class CursoService {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarAlumnos(String[] a){
        
        for (int i = 0; i <=4 ; i++) {
            System.out.println("Ingrese el nombre del alumno nro "+(i+1)+" :");            
            a[i] = leer.next();
        }
        
    }
    
    public Curso crearCurso(){
        
        System.out.println("Ingrese el nombre del curso");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la cantidad de horas por dias");
        int horasXD = leer.nextInt();
        System.out.println("Ingrese la cantidad de dias por semana");
        int diasXS = leer.nextInt();
        System.out.println("Ingrese el turno (mañana/tarde)");
        String turno = leer.next().toLowerCase();
        System.out.println("Ingrese el precio por hora");
        double precio = leer.nextDouble();
        String [] alumnos = new String[5];
        cargarAlumnos(alumnos);
        
        
        return new Curso(nombre,horasXD,diasXS,turno,precio,alumnos);
    }
    
    public void calcularGananciaSemanal(Curso a){
        int horas = a.getCantidadDeHorasPorDia();
        int dias = a.getCantidadDeDiasPorSemana();
        double precio = a.getPrecioPorHora();
        
        double total =  (dias*horas*precio)*5;
        
        System.out.println("Con los datos de este curso la ganancia semanal es de "+total);
    }
         
            
    
}
