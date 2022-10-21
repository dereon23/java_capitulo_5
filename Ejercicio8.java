package Capitulo5;
import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		System.out.println("Introduzca un número del que quiera la tabla de multiplicar");
		
		Scanner s = new Scanner(System.in);
		int i = Integer.parseInt(s.nextLine());
		
		for(int j=1;j<=10;j++) {
			System.out.println(j*i);
		}
		
	}
	
}
