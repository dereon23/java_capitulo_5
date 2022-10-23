package Capitulo5;
import java.util.Scanner;

public class Ejercicio66 {
	
	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			System.out.println("Introduce la altura");
			int altura = s.nextInt();
			
			if ((altura<3) || (altura%2==0)) {
				
				System.out.println("Altura debe ser impar mayor que 2");
				
			} else {
				
				System.out.println("");
				
				for (int i = 0; i < altura / 2; i++) {
					for (int j = 0; j < i; j++) {
						System.out.print(" ");
					}
					System.out.println("* *");
				}
				
				for (int i=altura/2; i>=0; i--) {
					for (int j=0; j<i; j++) {
						System.out.print(" ");
					}
					System.out.println("* *");
				}
				
			}
		}

}
