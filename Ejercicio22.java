package Capitulo5;

public class Ejercicio22 {

	public static void main(String[] args) {
		
		boolean esPrimo=true;
		for(int i=2; i<100;i++) {
				for(int j=2; j<i;j++) {
					if(i%j==0) {
						esPrimo=false;
					}
				}
				if(esPrimo) {
					System.out.print(i+" ");
				}
				esPrimo=true;
		}
		System.out.print(100);
		
	}
	
}
