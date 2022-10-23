package Capitulo5;
import java.util.Scanner;


public class Ejercicio55 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero");
		long numero = s.nextInt();
		
		long copia = numero;
		int longitud = 0;
		
		while (copia > 0) {
			copia=copia/10;
			longitud++;
		}
		
		int ultimo = (int)(numero%10);
		long aux=numero/10;
		long resultado =ultimo*(long)Math.pow(10,longitud-1)+aux;
		System.out.println("El resultado es " + resultado);
		}

}
