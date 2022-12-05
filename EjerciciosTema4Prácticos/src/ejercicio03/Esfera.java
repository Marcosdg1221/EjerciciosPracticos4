package ejercicio03;

import java.util.Scanner; //Importamos el java.util que necesitamos
public class Esfera{
	
static double radio;

 public static double superficie() {
	 double superficie;
	 superficie=4*(Math.PI) * radio;
				return superficie;
 }
public static double volumen() {
		double volumen=((4*(Math.PI)/3) * (Math.pow(radio, 3)));
		return volumen;
}
}