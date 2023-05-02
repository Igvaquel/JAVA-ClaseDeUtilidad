/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.MesSecreto;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pepo
 */
public class MesSecretoService {
     Scanner leer = new Scanner(System.in);
    
    public MesSecreto crear(){
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio","julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        Random random = new Random();
        int randomNumber = random.nextInt(12) + 1;
        
        return new MesSecreto(meses,meses[randomNumber]);
    }

    public void juego(MesSecreto a){
        do { 
            System.out.println("Ingre el mes secreto (en minusculas)");
            String mesS = leer.next();
            if(mesS.equals(a.getSecreto())){
                System.out.println("¡Correcto! Has adivinado el mes secreto.");
                break;
            }else{
                 System.out.println("Lo siento, ese no es el mes secreto. Inténtalo de nuevo.");
            }
            
        } while (true);
    }
}
