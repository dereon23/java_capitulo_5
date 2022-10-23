package Capitulo5;
import java.util.Scanner;


public class Ejercicio63 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la altura de la primera");
		int altura1 = s.nextInt();
		
		System.out.println("Introduce la altura de al segunda");
		int altura2 = s.nextInt();
		
		int alturamax = Math.max(altura1,altura2);
		int espacios1 = altura1-1;
		int espacios2 = altura2-1;
		int base1 = altura1*2-1;
		int base2 = altura2*2-1;
		int asteriscos1=1;
		int asteriscos2=1;
		
		for (int i=alturamax; i>0; i--) {
			
			if (i>altura1) {
				
				for (int j=0; j<=base1; j++) {
					System.out.print(" ");
				}
				
			} else {
				
				for (int j=0; j<espacios1; j++) {
					System.out.print(" ");
				}
				for (int j=0; j<asteriscos1; j++) {
					System.out.print("*");
				}
				for (int j=0; j<=espacios1; j++) {
					System.out.print(" ");
				}
				
				espacios1--;
				asteriscos1+=2;
				
			}
			
			if (i>altura2) {
				for (int j=0; j<base2; j++) {
					System.out.print(" ");
				}
			} else {
				
				for (int j=0; j<espacios2; j++) {
					System.out.print(" ");
				}
				for (int j=0; j<asteriscos2; j++) {
					System.out.print("*");
				}
				for (int j=0; j<=espacios1; j++) {
					System.out.print(" ");
				}
				
				espacios2--;
				asteriscos2 += 2;
			}
			
			System.out.println("");
		}
		
	}

}
