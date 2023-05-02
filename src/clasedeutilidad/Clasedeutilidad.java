/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasedeutilidad;

import entidades.Ahorcado;
import entidades.Cadena;
import entidades.Curso;
import entidades.MesSecreto;
import entidades.ParDeNumeros;
import entidades.Persona;
import java.util.Scanner;
import servicios.AhorcadoService;
import servicios.ArregloService;
import servicios.CadenaServicio;
import servicios.CursoService;
import servicios.FechaService;
import servicios.MesSecretoService;
import servicios.ParDeNumerosService;
import servicios.PersonaService;

/**
 *
 * @author Pepo
 */
public class Clasedeutilidad {

    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);   
        
        
        
        /*EJ1
        Cadena frase = new Cadena("hola que tal");
        CadenaServicio servicio = new CadenaServicio();

        servicio.mostrarVocales(frase);
        servicio.invertirFrase(frase);
        servicio.vecesRepetido(frase, "o");
        servicio.compararLongitud(frase, "pedro");
        servicio.unirFrases(frase, "pedro");
        servicio.reemplazar(frase, "*");
        servicio.contiene(frase,"a");*/
        
        /*EJ2
        ParDeNumeros a = new ParDeNumeros();
        ParDeNumerosService servicio = new ParDeNumerosService();
        
        servicio.mostrarValores(a);
        servicio.devolverMayor (a);
        servicio.calcularPotencia(a);
        servicio.calculaRaiz(a);*/
        /*EJ3
        Double[] arregloA = new Double[50];
        Double[] arregloB = new Double[20];     
        ArregloService servicio = new ArregloService();
        servicio.inicializarA(arregloA);
        servicio.mostrar(arregloA);
        servicio.ordenar(arregloA);
        servicio.mostrar(arregloA);
        servicio.inicializarB(arregloA, arregloB);
        servicio.mostrar(arregloB);*/
        
        /*EJ4
        FechaService servicio = new FechaService();
        int diferencia =  servicio.diferencia(servicio.fechaNacimiento(),servicio.fechaActual());
        System.out.println(diferencia);*/
        
        /*EJ5
        PersonaService servicio = new PersonaService();
        Persona persona = servicio.crearPersona();
        servicio.calcularEdad(persona);
        servicio.menorQue(persona,32);
        servicio.mostrar(persona);*/
        
        /*EJ6
        CursoService servicio = new CursoService();
        Curso uno = servicio.crearCurso();
        servicio.calcularGananciaSemanal(uno);*/
        
        /*EJEX1
        MesSecretoService servicio = new MesSecretoService();
        MesSecreto uno = servicio.crear();
        servicio.juego(uno);*/
        
        

        AhorcadoService as = new AhorcadoService();
        Ahorcado a = as.crearJuego();
        boolean control;
        String letras;
        String palabra;
        
        do {
            as.juego(a);
            letras = new String(a.getLetras());
            palabra = new String(a.getPalabra());
            if (palabra.equalsIgnoreCase(letras)){
                control = true;
                System.out.println("Adivinaste la palabra. GANASTEEEEEEEE.");
                break;
            }else{
                control = false;
            }
        } while (a.getTurnos() != 0);
        System.out.println("El juego ha terminado.");   
    }       
}
    
