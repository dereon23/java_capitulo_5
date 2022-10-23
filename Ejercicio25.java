package Capitulo5;
import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un número positivo");
		int numero=s.nextInt();
		int numeroreves=0;
		
		while(numero>9) {
			numeroreves=numeroreves*10+numero%10;
			numero=numero/10;
		}
		numeroreves=numeroreves*10+numero%10;
		
		
		System.out.println("Al revés "+numeroreves);
		
	}
	
}
