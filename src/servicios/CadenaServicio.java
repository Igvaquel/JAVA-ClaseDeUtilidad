/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cadena;

import java.util.Scanner;


public class CadenaServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void mostrarVocales(Cadena frase){
        
        int a = 0;
        
        for (int i = 0; i < frase.getLongitud(); i++) {
            char c = frase.getFrase().charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                a++;
            }
        }
        
        System.out.println("Hay un total de "+a+" vocales");
    }
    public void invertirFrase(Cadena frase){
        String inversion = "" ;
        for (int i = frase.getLongitud() -1; i>=0; i--) {
            inversion += frase.getFrase().charAt(i);
        }
        System.out.println("La frase invertida queda: "+inversion);
        
        
        
    }
    public void vecesRepetido(Cadena frase, String letra){
        int a =0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            char c = frase.getFrase().charAt(i);
            if(c == letra.charAt(0)){
                a++;
            }
        }
        System.out.println("El carácter "+letra+" se repite "+a+" veces.");
    }
    public void compararLongitud(Cadena frase, String frase2){
        int a = frase.getLongitud();
        int b = frase2.length();
        if (a > b) {
            System.out.println("La frase contenida en la clase es más larga.");
        } else if (b < a) {
            System.out.println("La frase ingresada por el usuario es más larga.");
        } else {
            System.out.println("Ambas frases tienen la misma longitud.");
        }
        
        
    }
    public void unirFrases(Cadena frase, String frase2){
        String fraseUnida= frase.getFrase()+frase2;
        System.out.println("Las 2 frases juntadas da como resultado: "+fraseUnida);
    }
    public void reemplazar(Cadena frase, String letra){
        String a ="a" ;
        char aChar = a.charAt(0);
        String fraseReemplazada = frase.getFrase().replace(aChar, letra.charAt(0));
        System.out.println("La frase resultante es: " + fraseReemplazada);
    }
    public boolean contiene(Cadena frase, String letra){
        boolean bandera = false;
        
        
        for (int i = 0; i < frase.getLongitud(); i++) {
            char c = frase.getFrase().charAt(i);
            if(c == letra.charAt(0)){
                bandera = true;
            }
        }
        System.out.println(bandera);
        return bandera;
    }
}
