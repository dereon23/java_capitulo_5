package Capitulo5;
import java.util.Scanner;


public class Ejercicio52 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero");
		long numero = s.nextLong();
		
		long copia = numero;
		int tamano = 0;
		
		while (copia > 0) {
			copia=copia/10;
			tamano++;
		}
		
		int primero = (int)(numero/Math.pow(10,tamano-1));
		long aux = (long)(primero*Math.pow(10,tamano-1));
		long resultado = (numero-aux)*10 + primero;
		
		System.out.println("El resultado es " + resultado);
		
		}

}
