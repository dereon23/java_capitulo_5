package Capitulo5;
import java.util.Scanner;


public class Ejercicio68 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero");
		long numero=s.nextLong();
		
		long copia=numero;
		long resultado=0;
		int cuentaDigitos=0;
		
		while (numero>0) {
			
			int digito = (int)(numero%10);
			int nuevoDigito = digito%2 == 1?--digito:++digito;
			resultado = (long) (nuevoDigito * Math.pow(10, cuentaDigitos) + resultado);
			numero= numero/10;
			cuentaDigitos++;
			
		}
		System.out.println("Dislocando el " + copia + " sale el " + resultado);
		
	}

}
