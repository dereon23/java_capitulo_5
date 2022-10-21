package Capitulo5;
import java.util.Scanner;

public class Ejercicio17 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		int numero = s.nextInt();
		if(numero>0) {
			
			int resultado=0;
			
			for(int i=numero; i<=numero+100;i++) {
				
				resultado=resultado+i;
			}
			System.out.println("El resultado es "+resultado);
		}
		
	}
	
	

}
