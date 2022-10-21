package Capitulo5;
import java.util.Scanner;

public class Ejercicio21 {
	
	public static void main(String[] args) {
		
		System.out.println("Introduce números positivos y uno negativo para terminar");
		
		Scanner s = new Scanner(System.in);
		int entrada=0;
		int cantidad=0;
		int cantidad_impares=0;
		int suma_impares=0;
		int mayor_par=-1;
		while(entrada>=0) {
			entrada = s.nextInt();
			if(entrada>0) {
				cantidad++;
				if(entrada%2==1) {
					cantidad_impares++;
					suma_impares=suma_impares+entrada;
				}else {
						if(entrada>mayor_par) {
							mayor_par=entrada;
						}
				}
			}
		}
		
		System.out.println("Total números introducidos: "+cantidad);
		if(cantidad_impares!=0) {
			System.out.println("Media de impares "+suma_impares/cantidad_impares);
		}
		if(mayor_par!=-1) {
			System.out.println("El par más grande "+mayor_par);
		}
		
	}

}
