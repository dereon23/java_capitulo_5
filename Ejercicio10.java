package Capitulo5;
import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		
		System.out.println("Introduce números hasta que uno sea negativo");
		
		Scanner s = new Scanner(System.in);
		
		int contador=0;
		int entrada=0;
		int entradas=0;
		while(entrada>-1) {
			
			entrada=s.nextInt();
			
			if(entrada>-1) {
				entradas=entradas+entrada;
				contador++;
			}
			
		}
		
		System.out.println("La media es "+entradas/contador);
		
	}

}
