package Capitulo5;
import java.util.*;

public class Ejercicio9 {

	
	public static void main(String[] args) {
		
		System.out.println("Introduce un número positivo");
		Scanner s = new Scanner(System.in);
		long number = Integer.parseInt(s.nextLine());
		
		int cifras=1;
		while(number/10>1) {
			cifras++;
			number=number/10;
		}
		
		System.out.println("El número tiene "+cifras+" cifras");
		
	}
	
	
}
