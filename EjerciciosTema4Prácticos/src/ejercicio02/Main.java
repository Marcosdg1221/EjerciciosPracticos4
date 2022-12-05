package ejercicio02;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		double volumen;
		double superficie;
		
			// TODO Auto-generated method stub
		
			Scanner all = new Scanner(System.in); //pongo scanner
			System.out.println("Introduzca el radio de la esfera");
			Esfera.radio=all.nextDouble();
		Esfera resultado = new Esfera();
		System.out.println("La superficie es " + resultado.superficie());
		System.out.println("El volumen es " + resultado.volumen());
	}
}