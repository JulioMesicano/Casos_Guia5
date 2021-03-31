package com.senati.eti.modelo;

public class Calculadora1 {
	//Definicion de los atrivutos
	private float numero1;
	private float numero2;
	//Obtener y establecer el valor del atributo
    // Getters and Setter
	
	public float getNumero1() {
		return this.numero1;
	}
	
	public void setNumero1(float n1) {
		this.numero1 = n1;
	}
	
	public float getNumero2() {
		return this.numero2;
	}
	
	public void setNumero2(float n2) {
		this.numero2 = n2;
	}
	
	//Constructores(polimorfsimo añadir pero con el mismo parametro)
	public Calculadora1() {
		
	}
	
	public Calculadora1(float n1,float n2) {
		this.numero1 = n1;
		this.numero2 = n2;
	}
	
	//Metodos Solicitados
	public float Suma(){
		return this.numero1 + this.numero2;
		
	}
	
	public float Resta(){
		return this.numero1 - this.numero2;
		
	}
	
	public float Producto(){
		return this.numero1 * this.numero2;
		
	}
	
	public float Division(){
		float r = 0;
		
		if ( this.numero2 != 0)
			r=this.numero1 / this.numero2;
		
		return r;
	   
	}
	public float RestoEntero(){
		float r = 0;
		if (this.numero2 != 0)
			r= this.numero1 % this.numero2;
		return r;
	}
	public float Mayor(){
		float r = 0;
		if (this.numero1 > this.numero2)
			r=this.numero1;
		else
			r=this.numero2;
		return r;
		
	}
	
	public float Menor(){
		float r = 0;
		if (this.numero1 < this.numero2)
			r=this.numero1;
		else
			r=this.numero2;
		return r;
		
	}

}
	

