package Capitulo5;
import java.util.Scanner;

public class Ejercicio36 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Introduce un numero positivo");
		long numero = s.nextInt();
		long alreves = 0;
		while (numero>0) {
			alreves = (alreves*10) + (numero%10);
			numero = numero/10;
		}
		if (alreves == numero) {
			System.out.println(numero + " es capicuo");
		} else {
			System.out.println(numero + " no es capicuo");
		}
		}

	
}
