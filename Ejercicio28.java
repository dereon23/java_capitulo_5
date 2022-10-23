package Capitulo5;
import java.util.Scanner;


public class Ejercicio28 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero positivo");
		int numero = s.nextInt();
		int resultado=1;
		for(int i=numero;i>1;i--) {
			resultado=resultado*i;
		}
		System.out.println(numero+"!= "+resultado);
		
		
	}
	
	
}
