package Capitulo5;
import java.util.Scanner;

public class Ejercicio24 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca la altura: ");
		int altura=s.nextInt();
		
		for(int i=1; i<=altura;i++) {
			for(int j=1;j<=altura-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				if(j<i) {
					System.out.print(j+" ");
				}
				else if(j==i) {
					for(int k=i; k>0;k--) {
						System.out.print(k+" ");
					}
				}
			}
			System.out.print('\n');
		}
		
	}

}
