package ejercicio05;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		double a;
		int n;
		int numero;
		
			// TODO Auto-generated method stub
			Scanner all = new Scanner(System.in); //pongo scanner
			System.out.println("Introduzca un número");
			FuncionesRecursivas.a=all.nextDouble();
			System.out.println("Introduzca otro número");
			FuncionesRecursivas.n=all.nextInt();
			System.out.println("Introduzca otro número más");
			FuncionesRecursivas.numero=all.nextInt();
		FuncionesRecursivas resultado = new FuncionesRecursivas();
		System.out.println("La suma de el primer número más sus anteriores es " + resultado.sumatorio());
		System.out.println("La potencia es " + resultado.potencia());
		System.out.println("El fibonacci es " + resultado.fibonacci());
	}
}