package ar.edu.unlp.info.oo1.Ejercicio2BalanzaElectronica;

public class Producto {
	private double precioPorKilo;
	private double peso;
	private String descripcion;
	
	public Producto() {
		this.descripcion = "";
		this.precioPorKilo = 0;
		this.peso = 0;
	}
	public Producto(String desc, double peso,double precio) {
		this.descripcion = desc;
		this.peso = peso;
		this.precioPorKilo = precio;
	}
	public String getDescripcion(){
		return this.descripcion;
	}
	public double getPrecioPorKilo(){
		return this.precioPorKilo;
	}
	public double getPeso() {
		return this.peso;
	}
	public double getPrecio(){
		return this.peso * this.precioPorKilo;
	}
	public void setPrecioPorKilo(double precioPorKilo){
		this.precioPorKilo = precioPorKilo; 
	}
}
