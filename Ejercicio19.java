package Capitulo5;
import java.util.Scanner;

public class Ejercicio19 {
	
	public static void main(String[] args) {
		
		System.out.println("Elija un carácter");
		Scanner s = new Scanner(System.in);
		String letra = s.nextLine();
		
		System.out.println("Elija la altura");
		int altura = s.nextInt();
		
		for(int i=0; i<altura;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(letra);
			}
			System.out.print('\n');
		}
		
		
	}
	

}
