package ar.edu.unlp.info.oo1.Ejercicio3Presupuestos;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	public Item(String detalle,int cantidad,double costo){
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costo;
	}
	public double costo(){
		return this.cantidad *this.costoUnitario;
	}
	public double getCostoUnitario(){
		return this.costoUnitario;
	}
	public int getCantidad(){
		return this.cantidad;
	}
	public String getDetalle() {
		return this.detalle;
	}
	
}
