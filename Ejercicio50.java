package Capitulo5;
import java.util.Scanner;



public class Ejercicio50 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la altura");
		int altura = s.nextInt();
		
		System.out.print("Numero de espacios entre numeros");
		int espacios = s.nextInt();

		System.out.print("*");
		
		for (int i=0; i<espacios; i++) {
			System.out.print(" ");
		}
		System.out.print("****");
		
		for (int i=0; i<espacios; i++) {
			System.out.print(" ");
		}
		System.out.println("****");
		
		System.out.print("*");
		for (int i=0; i<espacios; i++) {
			System.out.print(" ");
		}
		
		System.out.print("* ");
		for (int i = 0; i<espacios; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		
		System.out.print("*");
		for (int i=0; i<espacios; i++) {
			System.out.print(" ");
		}
		
		System.out.print("****");
		for (int i=0; i<espacios; i++) {
			System.out.print(" ");
		}
		System.out.println("****");
		
		for (int fila=0; fila<altura-4; fila++) {
			System.out.print("*");
			for (int i=0; i<espacios; i++) {
				System.out.print(" ");
			}
			System.out.print(" *");
			
			for (int i=0; i<espacios; i++) {
				System.out.print(" ");
			}
			System.out.println(" *");
		}
		
		System.out.print("*");
		for (int i=0; i<espacios; i++) {
			System.out.print(" ");
		}
		
		System.out.print("****");
		for (int i=0; i<espacios; i++) {
			System.out.print(" ");
		}
		System.out.println("****");
	}


}
