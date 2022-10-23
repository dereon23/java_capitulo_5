package Capitulo5;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio44 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		
		System.out.println("Introduce un numero positivo");
		long numero1 = s.nextLong();
		
		System.out.println("Introduce una posicion para partir el numero");
		long pos = s.nextLong();
		
		System.out.println("Introduce una posicion agregar el numero");
		long digito = s.nextLong();
		
		long numero2 = numero1;
		int tamano = 0;
		
		do {
			numero2 =numero2/10;
			tamano++;
		} while(numero2>0);
		
		long izq = numero1/(long)( Math.pow(10,tamano-pos+1) );
		izq = izq*10+digito;
		
		long der = numero1%(long)( Math.pow(10,tamano-pos+1) );
		numero2 = izq*(long)( Math.pow(10,tamano-pos+1) ) + der;
		System.out.print("Queda " + numero2);
		}

}
