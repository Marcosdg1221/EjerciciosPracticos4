package ejerciciospracticos;

//pongo java util
import java.util.Scanner;

//Inicio el main

public class Main {
		//Hago un void y genero las variables esPrimo y Capicua, son booleanas, y un int num1.
	public static void main(String[] args) {
		boolean esPrimo;
		boolean esCapicua;
		int num1;
			// TODO Auto-generated method stub
		
			Scanner all = new Scanner(System.in); //pongo scanner
			System.out.println("Introduzca un número");
		//El número a pedir es num1, cogerá su valor.

		num1 = all.nextInt();
		//Genero una nueva clase llamada números.
		Numeros resultado = new Numeros();
		//Cuando ya los tenga, pongo resultado.
		System.out.println("El número es primo" + resultado.esPrimo(num1));
		System.out.println("El número es capicua" + resultado.esCapicua(num1));
	}

}
