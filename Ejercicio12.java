package Capitulo5;
import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
		System.out.println("¿Cuántos números de Fibonacci?");
		Scanner s=new Scanner(System.in);
		int N = s.nextInt();
		int contador=0;
		
		int i=0; int j=1; int repuesto;
		while(contador<N) {
			System.out.print(i+" ");
			repuesto = i+j;
			j=i;
			i=repuesto;
			contador++;
			
			
		}
		
		
	}
	
	

}
