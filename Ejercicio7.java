package Capitulo5;
import java.util.*;


public class Ejercicio7 {

	public static void main(String[] args) {
		
		System.out.println("Introduzca la contraseña de 4 cifras");
		Scanner s = new Scanner(System.in);
		
		String contrasena="";
		while(!contrasena.equals("3475")){
			contrasena = s.nextLine();
			if(!contrasena.equals("3475")) {
				System.out.println("Lo siento, esa no es la combinación");
			}else{
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
			}
		}
		
		
	}
	
}
