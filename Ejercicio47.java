package Capitulo5;

import java.util.Scanner;


public class Ejercicio47 {
	
	public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce la altura");
			int altura = s.nextInt();
			
			int extra = (altura-3)/2;
			
			if ((altura % 2 != 0) && (altura >= 5)) {
				System.out.println("MMMMMM");
				for (int i = 0; i < extra; i++) {
					System.out.println("M M");
				}
				System.out.println("MMMMMM");
					for (int i = 0; i < extra; i++) {
				System.out.println("M M");
				}
				System.out.println("MMMMMM");
			} else {
				System.out.println("Tiene que ser impar y mayor o igual que 5");
			}
			
		}

}
