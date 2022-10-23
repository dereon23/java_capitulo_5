package Capitulo5;
import java.util.Scanner;


public class Ejercicio49 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce numeros positivos y uno primo para terminar");
		
		int numero;
		int suma = 0;
		int contador = 0;
		boolean esPrimo;
		
		do {
			
			numero = s.nextInt();
			esPrimo = true;
			
			for (int i = 2; i < numero; i++) {
				if ((numero % i) == 0) {
					esPrimo = false;
				}
			}
			if (!esPrimo) {
				suma += numero;
				contador++;
			}
			
		} while (!esPrimo);
		
		System.out.println("Hay "+contador+" numeros");
		System.out.println("La media es" + (double)suma/contador);
	}

}
