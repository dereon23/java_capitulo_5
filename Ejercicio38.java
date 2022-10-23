package Capitulo5;
import java.util.Scanner;

public class Ejercicio38 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Introduce la altura");
		int altura1 = s.nextInt();
		int altura2 = 1;
		int asteriscos = altura1;
		int espacioslado = 0;
		if ((altura2 < 3) || (altura2 % 2 == 0)) {
			System.out.print("Altura impar mayor o igual que 3");
		} else {
			while (altura2 < altura1 / 2 + 1) {
				for (int i = 1; i <= espacioslado; i++) {
					System.out.print(" ");
				}
				for (int i = 0; i < asteriscos; i++) {
					System.out.print("*");
				}
				System.out.println();
				altura2++;
				espacioslado++;
				asteriscos -= 2;
			} 
			espacioslado = altura1 / 2;
			altura2 = 1;
			while (altura2 <= altura1/2 + 1) {
				for (int i = 1; i <= espacioslado; i++) {
					System.out.print(" ");
				}
				for (int i = 0; i < asteriscos; i++) {
					System.out.print("*");
				}
				System.out.println();
				altura2++;
				espacioslado--;
				asteriscos += 2;
			}
		}
	}
}		
	

