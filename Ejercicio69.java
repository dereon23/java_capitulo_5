package Capitulo5;
import java.util.Scanner;

public class Ejercicio69 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la altura");
		int altura = s.nextInt();
		
		int ultima=1;
		int largo=1;
		int espacios=altura-1;
		
		while (ultima<=altura) {
			
			for (int i=1; i<=espacios; i++) {
				System.out.print(' ');
			}
			for (int i=0; i<=largo/2; i++) {
				System.out.print('*');
			}
			System.out.print(ultima % 2 == 1 ? "****" : " ");
			for (int i=0; i<=largo/2; i++) {
				System.out.print('*');
			}
			System.out.println();
			ultima++;
			espacios--;
			largo += 2;
		
		}
		
	}

}
