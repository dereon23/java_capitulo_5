package Capitulo5;
import java.util.Scanner;

public class Ejercicio37 {

		public static void main (String[] args) {
			
			long numero;
			Scanner s=new Scanner(System.in);
			do {
					
				System.out.print("Introduce un numero entero positivo");
				numero = s.nextLong();
				
			} while (numero<1);
			
			long extra = numero;
			int digitos = 0;
			long alreves = 0;
			while (extra > 0){
				alreves = ((alreves*10) + (extra % 10));
				extra /=10;
				digitos++;
			}
			long digito = 0;
			for (int i = 0; i < digitos; i++){
				digito = alreves%10;
				alreves=alreves/10;
				for (int j = 0; j < digito; j++){
					System.out.print("|");
				}
				if (i < digitos-1){
					System.out.print("-");
				}
			}
	}
}

