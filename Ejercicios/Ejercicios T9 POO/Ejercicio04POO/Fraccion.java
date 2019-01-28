/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04POO;

/**
 *
 * @author ODLana
 */
public class Fraccion {
    
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador + " / " + denominador;
    }
    
    public void invierte() {
        int aux;
        aux = numerador;
        numerador=denominador;
        denominador=aux;
    }
    
    public String divide(Fraccion fraccion2) {
        return (this.getNumerador() * fraccion2.getDenominador()) + " / " + (this.getDenominador() * fraccion2.getNumerador());
    }
    
    public String multiplica(Fraccion fraccion2) {
        return (this.getNumerador() * fraccion2.getNumerador()) + " / " + (this.getDenominador() * fraccion2.getDenominador());
    }
    
}
