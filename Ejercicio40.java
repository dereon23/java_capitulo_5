package Capitulo5;
import java.util.Scanner;

public class Ejercicio40 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la altura");
		
		int altura = s.nextInt();
		int espaciosdentro = 0;
		int espacioslado = altura/2;
		if ((altura<3) || (altura%2 == 0)) {
			System.out.print("Altura impar mayor o igual a 3");
		} else {
			int altura2 = 1;
			while (altura2 <= altura / 2 + 1) {
				for (int i = 1; i <= espacioslado; i++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (int i = 1; i < espaciosdentro; i++) {
					System.out.print(" ");
				}
				if (altura2>1) {
					System.out.print("*");
				}
				System.out.println();
				altura2++;
				espacioslado--;
				espaciosdentro+=2;
			}
			espaciosdentro = altura - 3;
			espacioslado = 1;
			altura2 = 0;
			while (altura2 < altura / 2) {
				for (int i = 1; i <= espacioslado; i++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (int i = 1; i < espaciosdentro; i++) {
					System.out.print(" ");
				}
				if(altura2 < altura / 2 - 1) {
					System.out.print("*");
				}
				System.out.println();
				altura2++;
				espacioslado++;
				espaciosdentro -= 2;
			}
		}
	}
}
	
