package Capitulo5;
import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		
		System.out.println("Introduce la altura");
		Scanner s = new Scanner(System.in);
		
		int altura=s.nextInt();
		
		for(int i=1;i<altura;i++) {
			System.out.println("*");
		}
		for(int j=0;j<(altura/2+1);j++) {
			System.out.print("*");
		}
		
	}
	
}
