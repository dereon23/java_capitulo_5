package Capitulo5;

import java.util.Scanner;

public class Ejercicio23 {
	
	public static void main(String[] args) {
		
		System.out.println("Introduce números positivos: ");
		
		Scanner s = new Scanner(System.in);
		int entrada;
		int cantidad=0;
		int suma=0;
		int extra=0;
		while(suma+extra<10000) {
			entrada = s.nextInt();
			if(entrada>0) {
				if(suma+entrada<10000) {
					cantidad++;
					suma=suma+entrada;
				}else {
					extra=entrada;
				}
			}
		}
		
		
		System.out.println("Total números introducidos: "+cantidad);
		System.out.println("Total sumado: "+suma);
		System.out.println("Media: "+suma/cantidad);

		
	}

}
