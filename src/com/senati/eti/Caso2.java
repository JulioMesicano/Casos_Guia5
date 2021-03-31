package com.senati.eti;

import java.util.Scanner;

import com.senati.eti.modelo.Calculadora2;

public class Caso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.print("Primer numero :");
        float n1 = sc.nextFloat();
        
        System.out.print("Segundo numero :");
        float n2 = sc.nextFloat();
        
        Calculadora2 calc = new Calculadora2(n1,n2);
        
        System.out.println("\nNumeros Ingresados");
        System.out.println("====================");
        System.out.println("numero 1.... "+calc.getNumero1());
        System.out.println("numero 2....."+calc.getNumero2());
        
        System.out.println("\n-----RESULTADOS ");
        System.out.println("====================");
        System.out.println("Suma.............."+ calc.Operar(1));
        System.out.println("Resta............."+ calc.Operar(2));
        System.out.println("Producto.........."+ calc.Operar(3));
        if (calc.getNumero2()==0) {
        	System.out.println("Division........No es posible");
        	System.out.println("Resto entero....No es posible");}
        else {
        System.out.println("Division.........."+ calc.Operar(4));
        System.out.println("Resto entero......"+ calc.Operar(5));}
        
        System.out.println("El promedio es ............" + calc.Operar(6));
        System.out.println("La suma de cuadrados...... " + calc.Operar(7));
        System.out.println("Diferencia porcentual..... " + calc.Operar(8) +"%");
        System.out.println("El numero mayor es........." + calc.Operar(9));
        System.out.println("El numero menor es........." + calc.Operar(10));
        
        
	}

}
