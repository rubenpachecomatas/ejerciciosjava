
package Ejercicio01POO;

/**
 *
 * @author ODLana
 */
public class Caballo {

        private String nombre;
        private String sexo;
        private int edad;
        private String color;

    public Caballo(String nombre, String sexo, int edad, String color) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getSexo() {
        return this.sexo;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getColor() {
        return this.color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void relinchar() {
        System.out.println("Buenas tardes caballero.");
    }
        
}
