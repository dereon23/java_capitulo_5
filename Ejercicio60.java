package Capitulo5;
import java.util.Scanner;


public class Ejercicio60 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la altura");
		int altura = s.nextInt();
		
		for (int i=0; i<altura-2; i++) {
			System.out.println("*** ***");
		}
		
		for (int i=0; i<2; i++) {
			System.out.println("****** ******");
		}
		
	}

}
