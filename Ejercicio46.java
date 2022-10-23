package Capitulo5;

import java.util.Scanner;

public class Ejercicio46 {
	
	public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
	
			System.out.print("Introduce el ancho");
			int ancho = s.nextInt();
			System.out.print("Introduce la altura");
			int altura = s.nextInt();
			
			if ((ancho<2) || (altura<2)) {
				System.out.print("Minimo 2 de ancho y altura");
			} else {
				for (int i = 1; i <= ancho; i++) {
					System.out.print("*");
				}
				for (int i = 2; i < altura; i ++) {
					System.out.println("");
				for (int espacios = 2; espacios < ancho; espacios++) {
					System.out.print(" ");
				}
				System.out.print("*");
				}
				System.out.println();
				for (int i = 1; i <= ancho; i++) {
					System.out.print("*");
				}
			}
		}
	
}
