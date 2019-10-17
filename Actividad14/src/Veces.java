/*
 * 4 _ Escribe un programa que reciba como datos una cadena de caracteres y un carácter 
 * aislado, y posteriormente informe del número de veces que se encuentra el
 * carácter en la cadena.
 */

import java.util.Scanner;

public class Veces {
	public static void main (String[] arg) {
	    int numVeces = 0;

	    Scanner in = new Scanner(System.in);
	    System.out.print("Introduce cadena: ");
	    String cadena = in.nextLine();
	    System.out.print("Introduce caracter: ");
	    String caracter = in.nextLine();

	    for(int i = 0; i < cadena.length(); i++) {
	      if (cadena.charAt(i) == caracter.charAt(0)) {
	        numVeces++;
	      }
	    }

	    System.out.println("Se ha encontrado " + numVeces + " veces");
	  }
}
