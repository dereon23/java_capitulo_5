package Capitulo5;
import java.util.Scanner;


public class Ejercicio48 {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero positivo");
		
		long numero = s.nextInt();
		long aux;
		boolean encontrado;
		
		System.out.print("Aparecen los digitos: ");
		
		for (int  i=0; i<10; i++) {
			
			encontrado = false;
			aux=numero;
			while (aux>0) {
				if (aux%10 ==i) {
					encontrado = true;
				}
				aux=aux/10;
			}
			if (encontrado) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		System.out.print("No aparecen los digitos: ");
		
		for (int i = 0; i < 10; i++) {
			
			encontrado = false;
			aux = numero;
			
			while (aux > 0) {
				if (aux % 10 == i) {
					encontrado = true;
				}
				aux /= 10;
			}
			if (!encontrado) {
				System.out.print(i + " ");
			}
		}
	}

		
}
