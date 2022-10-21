package Capitulo5;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca la base y el exponete");
		int base = s.nextInt(); int exponente = s.nextInt();
		for(int i=exponente;i>=1;i--) {
			System.out.print(base+"^"+(exponente-i+1)+" ");
		}
		
		
	}
	
	
}
