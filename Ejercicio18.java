package Capitulo5;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Introduce 2 números");
		int numero1 = s.nextInt(); int numero2 = s.nextInt();
		
		while(numero1<numero2) {
			System.out.print(numero1+" ");
			numero1=numero1+7;
		}
		while(numero2<numero1){
			System.out.print(numero2+" ");
			numero2=numero2+7;
		}
		
	}
	
	
}
