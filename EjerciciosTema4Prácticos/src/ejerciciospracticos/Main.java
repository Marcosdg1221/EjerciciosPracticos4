package ejerciciospracticos;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		boolean esPrimo;
		boolean esCapicua;
		int num1;
			// TODO Auto-generated method stub
		
			Scanner all = new Scanner(System.in); //pongo scanner
			System.out.println("Introduzca un número");

		num1 = all.nextInt();
		Numeros resultado = new Numeros();
		System.out.println("El número es primo" + resultado.esPrimo(num1));
		System.out.println("El número es capicua" + resultado.esCapicua(num1));
	}

}