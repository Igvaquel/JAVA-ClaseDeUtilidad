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
public class Curso {
   private String nombreCurso; 
   private int cantidadDeHorasPorDia;
   private int cantidadDeDiasPorSemana;
   private String turno;
   private double precioPorHora;
   private String[] alumnos;

    public Curso() {
        this.nombreCurso = "";
        this.cantidadDeHorasPorDia = 0;
        this.cantidadDeDiasPorSemana = 0;
        this.turno = "";
        this.precioPorHora = 0;
        this.alumnos = new String[5];
    }

    public Curso(String nombreCurso, int cantidadDeHorasPorDia, int cantidadDeDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadDeHorasPorDia = cantidadDeHorasPorDia;
        this.cantidadDeDiasPorSemana = cantidadDeDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getCantidadDeHorasPorDia() {
        return cantidadDeHorasPorDia;
    }

    public int getCantidadDeDiasPorSemana() {
        return cantidadDeDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadDeHorasPorDia(int cantidadDeHorasPorDia) {
        this.cantidadDeHorasPorDia = cantidadDeHorasPorDia;
    }

    public void setCantidadDeDiasPorSemana(int cantidadDeDiasPorSemana) {
        this.cantidadDeDiasPorSemana = cantidadDeDiasPorSemana;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
   
   
}
