/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio09POO;

/**
 *
 * @author ODLana
 */
public class Movil extends Terminal {
    
    private String tarifa;
    private int dinero;

    public Movil(String tarifa, String numero) {
        super(numero);
        this.tarifa = tarifa;
        this.dinero = 0;
    }
    
    @Override
    public String toString() {
        return "Nº " + this.getNumero() + ", " + this.getConversacion() + " - Tarificados " + dinero + " céntimos.";
    }
    
    
}
