package Capitulo5;

import java.util.Scanner;

public class Ejercicio42 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero positivo");
		int numero = s.nextInt();
		
		boolean esPrimo;
		for (int i=numero; i<numero+5; i++) {
			
			esPrimo = true;
			for (int j=2; j<i; j++) {
				if (i % j == 0) {
					esPrimo = false;
				}
			}
			if (esPrimo) {
				System.out.println(i + " es primo");
			} else {
				System.out.println(i + " no es primo");
			}
		}
	}

}
