/*
 * 3 _ Haz un programa que solicite una cadena de caracteres por teclado y determine el
 * número de mayúsculas y minúsculas.
 */

import java.util.Scanner;

public class Cadena {
	public static void main (String[] arg) {
	    int numMayusculas = 0;
	    int numMinusculas = 0;

	    Scanner in = new Scanner(System.in);
	    System.out.print("Introduce cadena: ");
	    String cadena = in.nextLine();

	    for(int i = 0; i < cadena.length(); i++) {
	      if (Character.isUpperCase(cadena.charAt(i)) == true) {
	        numMayusculas++;
	      } else {
	        numMinusculas++;
	      }
	    }

	    System.out.println("El numero de mayusculas es: " + numMayusculas);
	    System.out.println("El numero de minusculas es: " + numMinusculas);
	  }
}
