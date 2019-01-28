/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05POO;

/**
 *
 * @author ODLana
 */
public class Pizza {
    
    private static int totalServidas = 0;
    private static int totalPedidas = 0;
    private String tamaño;
    private String tipo;
    private String estado;

    public Pizza(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = "pedida";
        totalPedidas++;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }
    
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static void setTotalServidas(int totalServidas) {
        Pizza.totalServidas = totalServidas;
    }

    public static void setTotalPedidas(int totalPedidas) {
        Pizza.totalPedidas = totalPedidas;
    }
    
    public void sirve() {
        if (estado.equals("pedida")) {
            this.estado = "servida";
            totalServidas++;
        } else {
            System.out.println("Esta pizza ya está servida.");
        }
    }

    @Override
    public String toString() {
        return "Pizza" + " " + tipo + " " + tamaño + ", " + estado + '.';
    }
    
    
    
}
