package Capitulo5;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		
		System.out.println("Introduzca dos numeros");
		
		Scanner s= new Scanner(System.in);
		int hasta=s.nextInt();
		int divisor=s.nextInt();
		
		System.out.print("No son divisibles entre "+hasta+": ");
		
		for(int i=0;i<hasta;i++) {
			if(i%divisor!=0) {
				System.out.print(" "+i);
			}
		}
		
	}
	
}
