/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03POO;

/**
 *
 * @author ODLana
 */
public class TestAnimal {
    public static void main(String[] args) {
        
        Gato gato1 = new Gato("verde radioactivo", "Gatán", "Helicóptero Apache de combate");
        Canario canario1 = new Canario("rojo escarlata", "John el perro", "masculino");
        Perro perro1 = new Perro("blanco", "John el canario", "masculino");
        
        System.out.println("Hola, me llamo " + gato1.getNombre() + ", me identifico con el género " + gato1.getSexo() + " y "
                + "soy de color " + gato1.getColor() + ". Mira lo que se hacer.\n");
        
        gato1.Arañar();
        gato1.Mamar();
        
        System.out.println("\nHola, me llamo " + canario1.getNombre() + ", me identifico con el género " + canario1.getSexo() + " y "
                + "soy de color " + canario1.getColor() + ". Mira lo que se hacer.\n");
        
        canario1.Volar();
        canario1.Picotear();
        
        System.out.println("\nHola, me llamo " + perro1.getNombre() + ", me identifico con el género " + perro1.getSexo() + " y "
                + "soy de color " + perro1.getColor() + ". Mira lo que se hacer.\n");
        
        perro1.Morder();
        
    }
}
