package Capitulo5;
import java.util.Scanner;


public class Ejercicio59 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la altura");
		int altura1 = s.nextInt();
		
		int espacioslado = altura1 - 3;
		int espaciosdentro = 0;
		
		for (int i=1; i<=espacioslado; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		
		int altura2 = 2;
		while (altura2<altura1-1) {
			
			for (int i=1; i<=espacioslado; i++) {
				System.out.print(" ");
			}
			System.out.print("#");
			
			for (int i=1; i<espaciosdentro; i++) {
				System.out.print(" ");
			}
			
			if (altura2>2) {
				System.out.print("#");
			}
			System.out.println("");
			
			altura2++;
			espacioslado--;
			espaciosdentro += 2;
			
		}
		
		for (int i=1; i<altura2*2-2; i++) {
			System.out.print("#");
		}
		System.out.println("");
		
		espacioslado = altura1-3;
		
		for (int i=1; i<=espacioslado; i++) {
			System.out.print(" ");
		}
		System.out.println("#");
	}


}
