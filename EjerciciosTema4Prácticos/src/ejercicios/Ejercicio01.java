package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner all = new Scanner(System.in); //pongo scanner
		System.out.println("Introduzca un número");
		int num1 = all.nextInt();
		System.out.println("Introduzca otro número para sumarlo con el anterior");
		int num2 = all.nextInt();
		System.out.println("Introduzca un número con decimales");
		double nume1 = all.nextDouble();
		System.out.println("Introduzca otro número con decimales para sumarlo con el anterior");
		double nume2 = all.nextDouble();
		int suma=0;
		double suma1;
	numeros(suma);
}
	public static int numeros(int suma) {
		System.out.println("La suma es" + suma);
		return suma;
	}
	public static int numeros(int num1, int num2, int suma) {
		suma=num1+num2;
		System.out.println("La suma es" + suma);
		return suma;
		}
	public static double numeros(double nume1, double nume2, double suma1) {
		suma1= nume1+nume2;
		System.out.println("La suma es" + suma1);
		return suma1;
	}
	}

