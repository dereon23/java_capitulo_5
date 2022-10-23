package Capitulo5;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio43 {
		
		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			System.out.println("Introduce un numero positivo");
			long numero1 = s.nextLong();
			
			System.out.println("Introduce una posicion para partir el numero");
			long digito = s.nextLong();
			
			long numero2 = numero1;
			int digitos = 0;
			do {
				numero2 =numero2/10;
				digitos++;
			} while (numero2 > 0);
				long izq = numero1/(long)( Math.pow(10,digitos-digito+1) );
				long der = numero1%(long)( Math.pow(10,digitos-digito+1) );
				System.out.println("Izquierda: " + izq);
				System.out.println("Derecha: " + der);
			}

}
