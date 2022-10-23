package Capitulo5;
import java.util.Scanner;


public class Ejercicio64 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		
		int ancho=6;
		int altura=3;		
		int opcion=0;
		
		do {
			
			for (int i=0; i<ancho; i++) {
			System.out.print("*");
			}
			System.out.println("");
			
			for (int i = 0; i < altura - 2; i++) {
				System.out.print("*");
				for (int j = 0; j < ancho - 2; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			
			for (int i = 0; i < ancho; i++) {
				System.out.print("*");
			}
			
			
			System.out.println("");
			System.out.println("1. Agrandarlo");
			System.out.println("2. Achicarlo");
			System.out.println("3. Cambiar la orientación");
			System.out.println("4. Salir");
			System.out.print("Indique qué quiere hacer con el rectángulo: ");
			
			opcion = s.nextInt();
			
			switch(opcion) {
				case 1:
					ancho++;
					altura++;
					break;
				case 2:
					if ((ancho > 2) && (altura > 2)) {
						ancho--;
						altura--;
					}
					break;
				case 3:
					int aux = ancho;
					ancho = altura;
					altura = aux;
					break;
				default:
					System.out.print("");
			}
			System.out.println();
			
		}while (opcion!=4);
	}

}
