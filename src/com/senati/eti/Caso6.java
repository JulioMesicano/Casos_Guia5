package com.senati.eti;

import com.senati.eti.modelo.Alumno;
import java.io.*;
import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FileWriter archivo = null;
		PrintWriter pw = null;
		
		
		try {
			archivo = new FileWriter("info.txt",true);
			pw = new PrintWriter(archivo);
			
			System.out.println("Registro de Datos");
			System.out.println("=================");
			
			System.out.println("Nombre.......: ");
			String nom = sc.nextLine();
			
			System.out.println("Apellido.....: ");
			String ape = sc.nextLine();
			
			System.out.println("Genero <M/F>........");
			String gen = sc.nextLine();
			
			System.out.println("Edad [15 - 30]......");
			int ed = sc.nextInt();
			
			Alumno alu = new Alumno(nom, ape, gen , ed);
			
			//Escribir los datos en el archivo de texto
            pw.println("Datos Registrados")	;
            pw.println("=================");
            pw.println("Nombres y Apellido......: " + alu.NombreCompleto());
            pw.println("Genero..................: " + alu.MostrarGenero());
            
            System.out.println("Se creo el archivo correctamente........");
		} catch(Exception ex1){
			//Imprimir el detalle de error
			ex1.printStackTrace();
			
		}finally {
			//cierre del archivo
			try {
				if (archivo != null) archivo.close();
			} catch(Exception ex2) {
				ex2.printStackTrace();
			}
		}

	}

}
