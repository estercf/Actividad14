/* 1 _ Crea un programa para calcular la nota media de la clase, usando arrays como
 * 	   estructura de almacenamiento.
 *			a. Crea un programa que tenga un parámetro con el número de alumnos. Al
 * 			comienzo del mismo se pedirán las notas de cada uno de los alumnos
 *			(mostrando el número del alumno (desde 1 hasta N, siendo N el número
 * 			total de alumnos). Al finalizar el programa, se mostrará la nota media de la clase.
 */

import java.util.Scanner;
//import java.lang.*;

public class Clase {
	public static float media(float alumnos[]) {
	    float suma = 0;

	    for (int i = 0; i < alumnos.length; i++)
	      suma += alumnos[i];

	    return suma/alumnos.length;
	  }

	  public static void main (String[] arg) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("Numero de alumnos: ");

	    int numAlumnos = Integer.parseInt(in.nextLine());
	    float[] notas = new float[numAlumnos];

	    for(int i = 0; i < numAlumnos; i++) {
	      System.out.print("Nota del alumno " + (i+1) + ": ");
	      notas[i] = Float.parseFloat(in.nextLine());
	    }

	    System.out.println("La nota media es: " + media(notas));
	  }	
}

