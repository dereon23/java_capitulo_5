package Capitulo5;
import java.util.Scanner;

public class Ejercicio27 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero=s.nextInt();
		int contador=0;
		int suma=0;
		
		System.out.print("Los multiplos de 3 son ");
		for(int i=6;i<numero;i=i+3) {
			System.out.print(i+" ");
			suma=suma+i;
			contador++;
		}
		System.out.print("\n");
		System.out.println("En total hay "+contador);
		System.out.println("La suma es de "+suma);
		
	}
	

}
