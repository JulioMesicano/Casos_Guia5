package com.senati.eti;

import java.util.Scanner;

import com.senati.eti.modelo.Calculadora1;

public class Caso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        Calculadora1 calc = new Calculadora1();
        
        System.out.print("Primer numero :");
        float n1 = sc.nextFloat();
        
        System.out.print("Segundo numero :");
        float n2 = sc.nextFloat();
        
        calc.setNumero1(n1);
        calc.setNumero2(n2);
        
        System.out.println("\nNumeros Ingresados");
        System.out.println("====================");
        System.out.println("numero 1.... "+calc.getNumero1());
        System.out.println("numero 2....."+calc.getNumero2());
        
        System.out.println("\n-----RESULTADOS ");
        System.out.println("====================");
        System.out.println("Suma.............."+ calc.Suma());
        System.out.println("Resta............."+ calc.Resta());
        System.out.println("Producto.........."+ calc.Producto());
        if (calc.Division()==0) {
        	System.out.println("Division........No es posible");
        	System.out.println("Resto entero....No es posible");}
        else {
        System.out.println("Division.........."+ calc.Division());
        System.out.println("Resto entero......"+ calc.RestoEntero());}
        
        System.out.println("El numero mayor es " + calc.Mayor());
        System.out.println("El numero menor es " + calc.Menor());
        
        
        
	}

}
