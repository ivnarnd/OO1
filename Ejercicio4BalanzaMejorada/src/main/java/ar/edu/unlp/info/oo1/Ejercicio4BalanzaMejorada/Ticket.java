package ar.edu.unlp.info.oo1.Ejercicio4BalanzaMejorada;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
	 private LocalDate fecha;
	 private int cantidadDeProductos;
	 private double pesoTotal;
	 private double precioTotal;
	 private List<Producto> productos;
	 
	 public Ticket(List<Producto>prods){
		 this.fecha = LocalDate.now();
		 this.productos = new ArrayList<Producto>();
		 this.productos.addAll(prods);
		 
	 }
	 public LocalDate getFecha() {
		 return this.fecha;
	 }
	 public double getPesoTotal(){
		 double total = this.productos.stream().mapToDouble(item -> item.getPeso()).sum();
	    return total;
	 }
	 public double getPrecioTotal(){
		 double total = this.productos.stream().mapToDouble(item -> item.getPrecio()).sum();
	    return total;
	 }
	 public int getCantidadDeProductos() {
		 return this.productos.size();
	 }
	 public double impuesto() {
		 return this.getPrecioTotal()*0.21;
	 }
	 public List<Producto> getProductos(){
		 return this.productos;
	 }
	 
}
