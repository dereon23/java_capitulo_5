package Capitulo5;
import java.util.Scanner;

public class Ejercicio39 {

		public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			int numero;
			System.out.print("Introduce un numero entero positivo: ");
			numero = s.nextInt();
			for (int i = 1; i <= numero; i++) {
				int factorial = i;
				for (int j = 1; j < i; j++) {
					factorial=factorial*j;
				}
				System.out.println(i + "! = " + factorial);
			}
		}



}
