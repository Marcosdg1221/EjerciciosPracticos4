package ejerciciospracticos;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Numeros{
 public boolean esPrimo(int num1) {
	 boolean esPrimo=true;
	for (int cont=2;num1>cont;cont++) {
		if (num1%cont==0) {
			if (esPrimo==true) {
				return esPrimo;
				
			}
			else if (esPrimo==false){
				return esPrimo;
			}
	return esPrimo;
	
			}
		}
	return esPrimo;
	}


public boolean esCapicua(int num1) {
	boolean esCapicua;
	int salva; //Guarda el numero 
	int reves=0; //Comprobación de su nº invertido
	int resto; //Comprobación del resto para módulos
	
	//Pregunto por el valor del numero	

	//Salva se fija a numero/10, resto al modulo de salva/10 y reves al resto.
	
	  salva=(num1/10);
	  resto= salva%10;
	  reves=resto;
	
	  //Mientras salva sea diferente a 0 resto se fija a salva%10, reves a resto*10+resto y salva a sí misma/10
	  while(salva!=0) {
	   resto= salva%10;
	   reves=reves*10+resto;
	   salva= salva/10;
	  }
	  //Si reves es = a numero es capicua, si no, no; muestro scanner en ambos casos
	  if(reves==num1) {
		 esCapicua=false;
		  }
		 else {
		esCapicua=true;
		 }
	  return esCapicua;
}
}