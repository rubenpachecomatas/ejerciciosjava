/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio06POO;

/**
 *
 * @author ODLana
 */
public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return horas + "h " + minutos + "m " + segundos + 's';
    }
    
    public String suma(Tiempo tiempo2) {
        int horas;
        int minutos;
        int segundos;
        
        horas = this.horas + tiempo2.horas;
        minutos = this.minutos + tiempo2.minutos;
        segundos = this.segundos + tiempo2.segundos;
        
        if (segundos > 59) {
            segundos -= 60;
            minutos++;
        }
        
        if (minutos > 59) {
            minutos -= 60;
            horas++;
        }
        return horas + "h " + minutos + "m " + segundos + 's';
    }
    
    public String resta(Tiempo tiempo2) {
        int horas;
        int minutos;
        int segundos;
        
        horas = this.horas - tiempo2.horas;
        minutos = this.minutos - tiempo2.minutos;
        segundos = this.segundos - tiempo2.segundos;
        
        if (segundos < 0) {
            segundos += 60;
            minutos--;
        }
        
        if (minutos < 0) {
            minutos += 60;
            horas--;
        }
        return horas + "h " + minutos + "m " + segundos + 's';
    }
    
}
