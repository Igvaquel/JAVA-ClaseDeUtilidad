/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Pepo
 */
public class Ahorcado {
    
    private char [] palabra;
    private char [] letras;
    private int turnos;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, char[] letras, int turnos) {
        this.palabra = palabra;
        this.letras = letras;
        this.turnos = turnos;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public char[] getLetras() {
        return letras;
    }

    public void setLetras(char[] letras) {
        this.letras = letras;
    }

    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }
}

    

