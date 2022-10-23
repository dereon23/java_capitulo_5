package Capitulo5;
import java.util.Scanner;

public class Ejercicio35 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Introduce la altura");
		int altura1 = s.nextInt();
		int altura2 = 1;
		int i = 0;
		
		int espaciodentro = altura2 - 1;
		int espaciolado = 0;
		if ((altura2 < 3) || (altura2 % 2 == 0)) {
			System.out.print("Debe ser impar de altura mayor o igual que 3");
		} else {
			while (altura1 < altura2/2 + 1) {
				for (i= 1; i <= espaciolado; i++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (i = 1; i < espaciodentro; i++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
				altura1++;
				espaciolado++;
				espaciodentro -= 2;
			} 
			
			espaciodentro = 0;
			espaciolado = altura2/2;
			altura1 = 1;
			while (altura1 <= altura2 / 2 + 1) {
				for (i = 1; i <= espaciolado; i++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (i = 1; i < espaciodentro; i++) {
					System.out.print(" ");
				}
				if(altura1>1) {
					System.out.print("*");
				}
				System.out.println();
				altura1++;
				espaciolado--;
				espaciodentro+=2;
			}
		}
	}
}


