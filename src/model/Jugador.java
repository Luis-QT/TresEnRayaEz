/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LLLL
 */
public class Jugador {
    private String nombre;
    private boolean juegaFacil;
    private boolean juegaMedio;
    private boolean juegaDificil;
    private int puntuacionFacil;
    private int puntuacionMedio;
    private int puntuacionDificil;
    
    public Jugador(String nombre) {
        this.nombre = nombre;
        juegaFacil = false;
        juegaDificil = false;
        juegaMedio = false;
        puntuacionDificil =0;
        puntuacionFacil =0;
        puntuacionMedio =0;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacionFacil() {
        return puntuacionFacil;
    }

    public void setPuntuacionFacil(int puntuacionFacil) {
        this.puntuacionFacil = puntuacionFacil;
    }

    public boolean isJuegaFacil() {
        return juegaFacil;
    }

    public void setJuegaFacil(boolean juegaFacil) {
        this.juegaFacil = juegaFacil;
    }

    public boolean isJuegaMedio() {
        return juegaMedio;
    }

    public void setJuegaMedio(boolean juegaMedio) {
        this.juegaMedio = juegaMedio;
    }

    public boolean isJuegaDificil() {
        return juegaDificil;
    }

    public void setJuegaDificil(boolean juegaDificil) {
        this.juegaDificil = juegaDificil;
    }

    public int getPuntuacionMedio() {
        return puntuacionMedio;
    }

    public void setPuntuacionMedio(int puntuacionMedio) {
        this.puntuacionMedio = puntuacionMedio;
    }

    public int getPuntuacionDificil() {
        return puntuacionDificil;
    }

    public void setPuntuacionDificil(int puntuacionDificil) {
        this.puntuacionDificil = puntuacionDificil;
    }

    
    
}
