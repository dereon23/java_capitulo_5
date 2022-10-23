package Capitulo5;
import java.util.Scanner;

public class Ejercicio26 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un número y un dígito que extraer");
		int numero=s.nextInt();
		int digito=s.nextInt();
		
		int posicion=1;
		while(numero>9) {
			if(numero%10==digito) {
				System.out.println("El dígito está en la posición "+posicion);
			}
			numero=numero/10;
			posicion++;
		}
		if(numero==digito) {
			System.out.println("El dígito está en la posición "+posicion);
		}
		
	}

}
