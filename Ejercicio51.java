package Capitulo5;
import java.util.Scanner;


public class Ejercicio51 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero positivo");
		int numero1 = s.nextInt();
		
		int numero2 = numero1;
		int alreves = 0;
		boolean esComido = false;

		while (numero2 > 0) {
			if ((numero2%10 != 0) && (numero2%10 != 8)) {
				alreves = (alreves*10) + (numero2%10);
			} else {
				esComido = true;
			}
			numero2= numero2/10;
		}
		
		numero2 = alreves;
		alreves = 0;
		while (numero2>0) {
			alreves = (alreves*10) + (numero2%10);
			numero2=numero2/10;
		}
		
		if (esComido) {
			System.out.println("Tras ser comido se queda en " + alreves);
		} else {
			System.out.println("No se comio nada");
		}
	}

}
