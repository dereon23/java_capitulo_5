package Capitulo5;
import java.util.Scanner;

public class Ejercicio32 {
	
	public static void main(String[] args) {
		
		System.out.println("Introduce un numero positivo");
		
		Scanner s= new Scanner(System.in);
		
		long numero = s.nextLong();
		
		long alreves = 0;
		int digitos = 0;
		
		while (numero > 0) {
		alreves = (alreves * 10) + (numero % 10);
		numero = numero / 10;
		digitos++;
		}
		
		System.out.print("Digitos pares: ");
		
		int digito;
		int suma = 0;
		
		for (int i=0; i<digitos; i++) {
			
			digito = (int)alreves%10;
			if ((digito%2) == 0) {
				System.out.print(digito + " ");
				suma = suma+digito;
			}
			alreves=alreves/10;
			}
		System.out.println("Suma: " + suma);
	}

		
}


