package Capitulo5;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		System.out.println("Introduzca 10 números positivos y negativos");
		Scanner s = new Scanner(System.in);
		
		int positivos=0;int negativos=0;
		for(int i=0; i<10;i++) {
			int entrada=s.nextInt();
			if(entrada>0) {
				positivos++;
			}else if(entrada<0) {
				negativos++;
			}
		}
		System.out.println("Hay "+positivos+" positivos "+" y "+negativos+" negativos");
		
		
	}
	
	
}
