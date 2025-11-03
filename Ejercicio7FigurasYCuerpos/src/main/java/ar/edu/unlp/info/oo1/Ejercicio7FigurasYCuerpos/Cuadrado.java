package ar.edu.unlp.info.oo1.Ejercicio7FigurasYCuerpos;

public class Cuadrado implements Figura {
	private double lado;
	public Cuadrado(double lado){
		this.lado = lado;
	}
	public Cuadrado() {}
	
	public void setLado(double lado){
		this.lado = lado;
	}
	public double getLado(){
		return lado;
	}
	public double getArea() {
		return this.lado * this.lado;
	}
	public double getPerimetro(){
		return this.lado*4;
	}
}
