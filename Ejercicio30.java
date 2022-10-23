package Capitulo5;
import java.util.Scanner;

public class Ejercicio30 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int horas;
		
		System.out.println("Introduce un dia de la semana(1 a7)");
		int dia1=s.nextInt();
		System.out.println("Introduce la hora");
		int hora1=s.nextInt();
		
		System.out.println("Introduce un dia de la semana(1 a7)");
		int dia2=s.nextInt();
		System.out.println("Introduce la hora");
		int hora2=s.nextInt();
		
		if(dia1>dia2) {
			System.out.println("El primer dia debe ser posterior al primero");
		}
		else {
			horas=(dia2-dia1)*24;
			horas=+(24-hora1+hora2);
			System.out.println("Quedan "+horas+" horas");
		}
		
	}
		

	
}
