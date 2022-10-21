package Capitulo5;

import java.util.Scanner;

public class Ejercicio20 {
	
	public static void main(String[] args) {
		
		System.out.println("Elija un carácter");
		Scanner s = new Scanner(System.in);
		String letra = s.nextLine();
		
		System.out.println("Elija la altura");
		int altura = s.nextInt();
		
		for(int i=1; i<=altura;i++) {
			for(int j=1;j<=i;j++) {
				if((j==1||j==i)||(i==altura)) {
					System.out.print(letra);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print('\n');
		}
		
	}

}
