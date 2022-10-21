package Capitulo5;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int numero = s.nextInt(); int posicion = 2; boolean primo=true;
		while(posicion<=numero/2) {
			if(numero%posicion==0) {
				primo=false;
				break;
			}
			posicion++;
		}
		if(primo) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
	}
	
	
}
