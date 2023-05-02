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
public class MesSecreto {
    private String[] mes = new String[12];
    private String secreto;
    
    

    public MesSecreto(String[] mes, String secreto) {
        this.mes = mes;
        this.secreto = secreto;
    }

    public MesSecreto() {
        
    }

    public String[] getMes() {
        return mes;
    }

    public String getSecreto() {
        return secreto;
    }
    
    
    
    
    
}
