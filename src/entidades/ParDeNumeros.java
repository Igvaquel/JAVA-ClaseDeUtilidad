/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Random;

/**
 *
 * @author Pepo
 */
public class ParDeNumeros {
    private float a;
    private float b;

    public ParDeNumeros() {
        Random ran = new Random();
        
        this.a=(float)(Math.random()*10); 
        this.b = ran.nextFloat()*10;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }
    
    
}
