/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.ParDeNumeros;

/**
 *
 * @author Pepo
 */
public class ParDeNumerosService {
    
    public void mostrarValores (ParDeNumeros a){
        System.out.println(a.getA()+" "+ a.getB());
    }
    public void devolverMayor (ParDeNumeros a){
        if(a.getA()>a.getB()){
            System.out.println("A tiene mayor valor con un total de: "+a.getA());
        }else{
            System.out.println("B tiene mayor valor con un total de: "+a.getB());
        }
    }
    public void calcularPotencia(ParDeNumeros a){
        
        int aEntero = Math.round(a.getA()); 
        
        int bEntero = Math.round(a.getB());
        
        if(a.getA()>a.getB()){
            System.out.println(Math.pow(aEntero, bEntero)); 
        }else{
            System.out.println(Math.pow(bEntero, aEntero));
        }
    }
    public void calculaRaiz(ParDeNumeros a){
        float aEntero = Math.abs(a.getA()); 
        
        float bEntero = Math.abs(a.getB());
        
        if(a.getA()>=a.getB()){
            System.out.println(Math.sqrt(bEntero)); 
        }else{
            System.out.println(Math.sqrt(aEntero));
        }
    }
    
    
    
}
