package ejerciciospracticos;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		//Creo dos booleanos y un int para las funciones.
		boolean esPrimo;
		boolean esCapicua;
		int num1;
			// TODO Auto-generated method stub
		
			Scanner all = new Scanner(System.in); //pongo scanner
			System.out.println("Introduzca un número");
		//pido un numero y num1 será ese
		num1 = all.nextInt();
		//nueva clase
		Numeros resultado = new Numeros();
		//Muestro resultados
		System.out.println("El número es primo" + resultado.esPrimo(num1));
		System.out.println("El número es capicua" + resultado.esCapicua(num1));
	}

}
