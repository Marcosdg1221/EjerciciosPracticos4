package ejercicio05;

import java.util.Scanner; //Importamos el java.util que necesitamos
public class FuncionesRecursivas{
	
static double a;
static int n;
static int numero;
static double potencia;
static int fibonacci;

public double sumatorio() {
	
		double sumatorio;
		for (int nu=numero;nu<=1;nu--) {
			numero=(nu-1)+numero;
		}
				return numero;
}
public double potencia() {
	
	double potencia;
		potencia=Math.pow(a, n);
		return potencia;
	}

public static int fibonacci(){
		double pos=a;
		if (pos<=1) {
			fibonacci=1;
		} else {
			for (int num=0;num<a;num++) {
			fibonacci=(n-1)+(n-2);
			}
		}
		return fibonacci;
}
//funcion recursiva
	}