package Capitulo5;
import java.util.Scanner;


public class Ejercicio62 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero");
		long numero = s.nextLong();
		
		long copia = numero;
		int afortunados = 0;
		int noafortunados = 0;
		
		while (numero>0) {
			
			int digito = (int)(numero%10);
			if ((digito==3) || (digito==7) || (digito==8) || (digito==9)) {
				afortunados++;
			} else {
				noafortunados++;
			}
			
			numero=numero/10;
			
			}
		
		if (afortunados > noafortunados) {
			System.out.println(copia + " es afortunado");
		} else {
			System.out.println(copia + " no es afortunado");
		}
	}


}
