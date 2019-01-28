/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio08POO;

/**
 *
 * @author ODLana
 */
public class Terminal {
    private String numero;
    private int conversacion = 0;

    public Terminal(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Nº " + numero + ", " + conversacion + "s de conversación.";
    }
    
    public void llama(Terminal t, int tiempo) {
        this.conversacion += tiempo;
        t.conversacion += tiempo;
    }
    
    
}
