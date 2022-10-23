package Capitulo5;
import java.util.Scanner;

public class Ejercicio33 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Introduce la altura");
		
		int altura = s.nextInt();
		for (int i=1; i<altura; i++) {
		System.out.print("* ");
			for (int j=2; j<altura; j++) {
			System.out.print(" ");
			}
			System.out.println("*");
		}
		System.out.print(" ");
		for (int i = 2; i < altura-1; i++) {
			System.out.print("* ");
		}
	}
}
