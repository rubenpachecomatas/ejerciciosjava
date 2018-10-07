public class Ejercicio17If {
	
	public static void main (String[] args) {
		
    System.out.println("Introduce un número para saber cual es su última cifra: ");
    int x1 = Integer.parseInt(System.console().readLine());
    
    int cifra = x1 % 10;
    
    System.out.println("La última cifra es " + cifra);
	}
}

