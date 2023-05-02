/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Ahorcado;
import java.util.Arrays;

import java.util.Scanner;

/**
 *
 * @author Pepo
 */
public class AhorcadoService {

    Scanner leer_line = new Scanner(System.in);
    Scanner leer_int = new Scanner(System.in);

    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra a adivinar.");
        String p = leer_line.nextLine();
        p = p.toUpperCase();
        char[] palabra = p.toCharArray();
        boolean entradaValida = false;
        int turnos = 0;
        while (!entradaValida) {
            System.out.print("Ingrese la cantidad de jugadas máximas de (1 a 9): ");
            if (leer_int.hasNextInt()) {
                turnos = leer_int.nextInt();
                entradaValida = true;
            } else {
                System.out.println("* * * Ingreso invalido. Intente nuevamente * * *");
                leer_int.next();
            }
        }
        char[] letras = new char[palabra.length];
        for (int i = 0; i < letras.length; i++) {
            letras[i] = '_';
        }
        return new Ahorcado(palabra, letras, turnos);
    }

    public void longitud(Ahorcado x) {
        System.out.println("La longitud de la palabra es: " + x.getPalabra().length);
    }

    public char buscar(Ahorcado x, char a) {
        char[] vector = x.getPalabra();
        int no = 0;
        char l = ' ';
        for (int i = 0; i < x.getPalabra().length; i++) {
            if (vector[i] == a) {
                System.out.println("La letra se encuentra en la palabra secreta");
                l = a;
                break;
            } else {
                no++;
            }
        }
        if (no == x.getPalabra().length) {
            System.out.println("La letra no se encuentra en la palabra secreta");
            l = '_';
        }
        System.out.println(" ");
        return l;
    }

    public void encontrar(Ahorcado x, char a) {
        char[] vector = x.getPalabra();
        char[] vector2 = x.getLetras();
        boolean t = false;
        for (int i = 0; i < x.getPalabra().length; i++) {
            if (vector[i] == a) {
                vector2[i] = a;
                x.setLetras(vector2);
                t = true;
            }
        }
        if (t == false) {
            x.setTurnos(x.getTurnos() - 1);
        }
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(" " + Character.toUpperCase(vector2[i]) + " ");
        }
        System.out.println(" ");
        intentos(x);
    }

    public void intentos(Ahorcado x) {
        if (x.getTurnos() > 1 || x.getTurnos() < 1) {
            System.out.println(" ");
            System.out.println("Tenes " + x.getTurnos() + " intentos");
        } else {
            System.out.println(" ");
            System.out.println("Tenes " + x.getTurnos() + " intento");
        }
    }

    public void juego(Ahorcado a) {
        System.out.println(" ");
        System.out.print("Ingrese una letra ==> ");
        char letra = leer_line.next().charAt(0);
        letra = Character.toUpperCase(letra);
        encontrar(a, buscar(a, letra));
    }
}