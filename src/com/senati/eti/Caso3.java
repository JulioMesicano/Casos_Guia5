package com.senati.eti;

import java.util.Scanner;
import java.util.ArrayList;
import com.senati.eti.modelo.Alumno;



public class Caso3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Alumno> arrAlumno = new ArrayList<Alumno>();
		
		// Forma 1 de ingresar datos 
		Alumno al1 = new Alumno();
		
		al1.setNombre("Joe");
		al1.setApellido("Castillo");
		al1.setGenero("M");
		al1.setEdad(25);
		
		// Forma 2 de ingresar datos 
		Alumno al2 = new Alumno("Rosa","Flores","F",15);
		
		// Forma 3 de ingresar datos
		
		String nom = "" , ape = "" , gen  ="";
		int edad  =0 ;
		
		Alumno al3 = null;
		
		System.out.println("Registro de datos");
		System.out.println("-----------------");
		System.out.println("Nombre..........");
		nom = sc.nextLine();
		System.out.println("Apellido....");
		ape = sc.nextLine();
		System.out.println("Genero.... <M/F>");
		gen = sc.nextLine();
		System.out.println("Edad[15-30]...........");
		edad = sc.nextInt();
		
		al3 = new Alumno(nom , ape ,gen ,edad );
		
		//Agrefar los objetos Alumno al CONJUNTO
		arrAlumno.add(al1);
		arrAlumno.add(al2);
		arrAlumno.add(al3);
		
		//Impresion del ArrayList
		System.out.println("----Datos Registrados---");
		System.out.println("-------------------------");
		
		String patron = "%-4s %-20s %-10s %-15s";
		System.out.println(String.format(patron, "N","Nombres y Apellidos","Genero","Estado"));
		System.out.println(String.format(patron, "--","------------------","------","------"));

		for (int x = 0;x < arrAlumno.size(); x++)
			System.out.println(String.format(patron,(x+1), arrAlumno.get(x).NombreCompleto(),
					 arrAlumno.get(x).MostrarGenero(), arrAlumno.get(x).MostrarEstado()));
 	}

}
