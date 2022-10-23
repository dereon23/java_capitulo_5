package Capitulo5;
import  java.util.Scanner;


public class Ejercicio58 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero");
		long numero = s.nextLong();
		
		int suma = 0;
		int longitud = 0;
		
		while (numero>0) {
			suma += numero%10;
			numero=numero/10;
			longitud++;
		}
		
		System.out.println("La media de los digitos es " + (double)suma/longitud);
	}

}
