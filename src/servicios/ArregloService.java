/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;


import java.util.Arrays;
import java.util.Comparator;


import java.util.Random;

/**
 *
 * @author PepoDoubleDouble
 */
public class ArregloService {
    
    public void inicializarA(Double[] a){
               
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
             Arrays.fill(a,i,i+1,random.nextDouble() * 100);
        }
        System.out.println(a[1]+" "+a[4]);  
    }
    public void mostrar(Double[] a){
        System.out.println( Arrays.toString(a));
    }
    public void ordenar(Double[] a){
        
        /*  Double aux[] = new Double [50];
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] < a[j]) {
                        double temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
        }*/
        
        /*for (int i = 0; i < aux.length; i++) {
            aux[i]=a[i];            
        }
        for (int i = 0 ; i < a.length; i++) {
           a[i]=aux[a.length-i-1];     
        } */ 
        
        Arrays.sort(a,Comparator.reverseOrder());
              
    }
    public void inicializarB(Double[] a, Double[] b){
        for (int i = 0; i < 10; i++) {
             Arrays.fill(b,i,i+1,a[i]);
        }
        Arrays.fill(b, 10, b.length,0.5);
        System.out.println(b[9]+" "+b[19]);
    }
}
