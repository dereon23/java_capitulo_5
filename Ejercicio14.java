package Capitulo5;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca la base y el exponete");
		int base = s.nextInt(); int exponente = s.nextInt();
		int resultado=1;
		for(int i=0;i<exponente;i++) {
			resultado=resultado*base;
		}
		System.out.println("El resultado es "+resultado);
		
		
	}
	
	
}
