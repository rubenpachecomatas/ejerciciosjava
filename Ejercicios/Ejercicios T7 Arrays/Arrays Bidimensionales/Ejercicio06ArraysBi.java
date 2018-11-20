/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema.pkg7.arrays;

/**
 *
 * @author ODLana
 */
public class Ejercicio06ArraysBi {
    
    public static void main(String[] args) {
        
        int[][] num = new int[6][10];
        int fila;
        int columna;
        int filaMax = 0;
        int columnaMax = 0;
        int filaMin = 0;
        int columnaMin = 0;
        int min = 1000;
        int max = 0;
        boolean comprob;
        
        for (fila = 0; fila < 6; fila++) {
          for (columna = 0; columna < 10; columna++) {
              
            do {
              num[fila][columna] = (int)(Math.random() * 1001);
              comprob = false;
              for (int cont = 0; cont < 10 * fila + columna; cont++) {
                if (num[fila][columna] == num[cont / 10][cont % 10]) {
                  comprob = true;
                }
              }
            } while (comprob);
            
            System.out.printf("%3d ", num[fila][columna]);
            
            if(num[fila][columna] > max) {
              max = num[fila][columna];
              filaMax = fila + 1;
              columnaMax = columna + 1;
            } else if(num[fila][columna] < min) {
              min = num[fila][columna];
              filaMin = fila + 1;
              columnaMin = columna + 1;
            }
          }
          System.out.println("");
        }
        
        System.out.println("\nEl máximo valor es " + max + ", en fila " + filaMax + " columna " + columnaMax);
        System.out.println("El mínimo valor es " + min + ", en fila " + filaMin + " columna " + columnaMin);
        
    }
}
