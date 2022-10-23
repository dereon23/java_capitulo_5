package Capitulo5;
import java.util.Scanner;

public class Ejercicio34 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Introduce un numero");
		long numero1 = s.nextLong();
		System.out.print("Intrduce un numero");
		long numero2 = s.nextLong();
		
		long alreves = 0;
		int digitos = 0;
		if (numero1 == 0) {
		digitos = 1;
		}
		while (numero1 > 0) {
			alreves = (alreves * 10) + (numero1 % 10);
			numero1 /= 10;
			digitos++;
		}
		numero1 = numero2;
		long alreves2 = 0;
			
		while (numero1 > 0) {
			alreves2 = (alreves2 * 10) + (numero1 % 10);
			numero1 /= 10;
		} 
		long pares = 0;
		long impares = 0;
		int digito;
		for (int i = 0; i < digitos; i++) {
			digito = (int)(alreves % 10);
			if ((digito % 2) == 0) {
				pares = pares * 10 + digito;
			} else {
				impares = impares * 10 + digito;
			}
			digito = (int)(alreves2 % 10);
			if ((digito % 2) == 0) {
				pares = pares * 10 + digito;
			} else {
				impares = impares * 10 + digito;
			}
			alreves = alreves/10;
			alreves2 = alreves2/ 10;
		}
		System.out.println("El número formado por los dígitos pares es: " + pares);
		System.out.println("El número formado por los dígitos impares es: " + impares);
	}
}