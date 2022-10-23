package Capitulo5;
import java.util.Scanner;


public class Ejercicio61 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la altura");
		int altura1 = s.nextInt();
		
		int altura2 = 0;
		int espaciosdentro = altura1*2-1;
		int espacioslado = 0;
		
		if (altura1<3) {
			System.out.println("La altura debe ser mayor o igual a 3.");
		} else {
			while (altura2 < altura1) {
				for (int i=1; i<=espacioslado;i++) {
					System.out.print(" ");
				}
				System.out.print("***");
				for (int i=1; i<espaciosdentro; i++) {
					System.out.print(" ");
				}
				
				System.out.println("***");
				
				altura2++;
				espacioslado++;
				espaciosdentro -= 2;
			}
		}
	}


}
