package ar.edu.unlp.info.oo1.Ejercicio4BalanzaMejorada;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	 private List<Producto> productos;
	 
	 public Balanza() {
		 this.ponerEnCero();//utiliza el metodo de poner en cero para no repetir codigo
	 }
	 public int getCantidadDeProductos(){
		 return this.productos.size();
	 }
	 public double getPrecioTotal(){
		 return this.productos.stream().mapToDouble(prod->prod.getPrecio()).sum();
		 
	 }
	 public double getPesoTotal(){
		double total = this.productos.stream().mapToDouble(prod -> prod.getPeso()).sum();
    	return total;
	 }
	 public void ponerEnCero() {
		 this.productos = new ArrayList<Producto>();
	 }
	 public void agregarProducto(Producto prod){
		 this.productos.add(prod);
	 }
	 public Ticket emitirTicket() {
		 Ticket ticket =  new Ticket(this.getProductos());
		 return ticket;
	 }
	 public List<Producto> getProductos(){
		 return this.productos;
	 }
}
