package Capitulo5;
import    java.util.Scanner;

public class Ejercicio57 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la altura");
		int altura = Integer.parseInt(s.nextLine());
		
		for (int i = 0; i < altura; i++) {
			System.out.print("*");
		}
		System.out.println("");
		
		int espacios = 1;
		
		for (int i = 1; i < altura-1; i++) {
			
			for(int j=0; j<espacios; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			for (int j = 0; j < altura - i - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
			espacios++;
		}
		for (int i = 0; i < espacios; i++) {
			System.out.print(" ");
		}
		
		System.out.println("*");
		
	}



}
