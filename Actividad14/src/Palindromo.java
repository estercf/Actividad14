/*
 * 5 _ Implementa un programa que indique si una palabra es un palíndromo. 
 */

import java.util.Scanner;

public class Palindromo {
	public static void main (String[] arg) {
	    boolean esPalindromo = true;

	    Scanner in = new Scanner(System.in);
	    System.out.print("Introduce palabra: ");
	    String cadena = in.nextLine();

	    for(int i = 0; i < cadena.length(); i++) {
	      if (cadena.charAt(i) != cadena.charAt(cadena.length()-i-1)) {
	        esPalindromo = false;
	      }
	    }

	    if (esPalindromo == true) {
	      System.out.println("Es palindromo");
	    }  else {
	      System.out.println("No es palindromo");
	    }
	  }
}
