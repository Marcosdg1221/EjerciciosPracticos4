package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner all = new Scanner(System.in); //pongo scanner
		System.out.println("Introduzca un número");
		int num1 = all.nextInt();
		System.out.println("Introduzca otro número");
		int num2 = all.nextInt();
		System.out.println("Introduzca otro número");
		int num3 = all.nextInt();
		int media1 = 0;
		double media = 0.0;
	numeros(media1);
	numeros(media);
}
	public static int numeros(int media1) {
		media1 =(num1+num2)/2;
		System.out.println("La media de los dos numeros es" + media1);
		return media1;
	}
	public static int numeros(int num1, int num2, int media1) {
		media1 =(num1+num2)/2;
		System.out.println("La media es" + media1);
		return media1;
		}
	public static double numeros(int num1, int num2, int num3, double media) {
		media= (num1+num2+num3)/3;
		System.out.println("La media de los tres es" + media);
		return media;
	}
	}

