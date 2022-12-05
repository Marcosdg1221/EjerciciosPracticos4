package ejercicio04;

import java.util.Scanner; //Importamos el java.util que necesitamos
public class Operaciones{
	
static double num1, num2;

public double suma() {
		double suma;
		suma=num1+num2;
				return suma;
}

public double resta() {
	double resta;
	resta=num1-num2;
			return resta;
}
public double multiplicacion() {
	double multiplicacion;
	multiplicacion=num1*num2;
			return multiplicacion;
}
public double division() {
	double division;
	if (num1==0 | num2==0) {
		System.out.println("No se puede dividir por cero");
		division=0;
		return division;
	}
	else {
	division=num1*num2;
			return division;
}
}}