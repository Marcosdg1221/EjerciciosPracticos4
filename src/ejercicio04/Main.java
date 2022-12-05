package ejercicio04;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		double suma;
		double resta;
		double multiplicación;
		double división;
		double num1;
		double num2;
		int op;
		
			// TODO Auto-generated method stub
			Scanner all = new Scanner(System.in); //pongo scanner
			System.out.println("Introduzca un número");
			Operaciones.num1=all.nextDouble();
			System.out.println("Introduzca otro número");
			Operaciones.num2=all.nextDouble();
		Operaciones resultado = new Operaciones();
		System.out.println("La suma es " + resultado.suma());
		System.out.println("El resta es " + resultado.resta());
		System.out.println("La multiplicacion es " + resultado.multiplicacion());
		System.out.println("El division es " + resultado.division());
	}
}