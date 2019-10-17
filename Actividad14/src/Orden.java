/*
 * 2 _ El envoltorio Arrays posee muchas herramientas interesantes para vectores, entre
 * las que se incluye la ordenación (sort) y la impresión (toString) de vectores. 
 * Crea un programa que solicite al usuario el número de elementos a ordenar, solicite su
 * introducción por pantalla y finalmente los muestre por pantalla ordenados de forma
 * descendente. Debes utilizar un array para almacenar la información y los métodos
 * comentados para ordenar e imprimir el resultado. 
 */

import java.util.Scanner;

import java.util.Arrays;

public class Orden {
	public static void main (String[] arg) {
	    Scanner in = new Scanner(System.in);

	    System.out.print("Número de elementos a ordenar: ");
	    int numElementos = Integer.parseInt(in.nextLine());
	    int[] elementos = new int[numElementos];

	    for(int i = 0; i < numElementos; i++) {
	      System.out.print("Elemento: ");
	      elementos[i] = Integer.parseInt(in.nextLine());
	    }

	    Arrays.sort(elementos);
	    System.out.println(Arrays.toString(elementos));
	  }
}
