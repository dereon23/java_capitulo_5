package Capitulo5;

import java.util.Scanner;

public class Ejercicio41 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero positivo");
		long numero = s.nextLong();
		
		int pares = 0;
		int impares = 0;
		
		while (numero>0) {
			if ((numero%10)%2 ==0) {
				pares++;
			} else {
				impares++;
			}
			numero=numero/10;
		}
		System.out.print("Hay " + pares + " digitos pares y " + impares + " digitos impares.");
	}

	

}
