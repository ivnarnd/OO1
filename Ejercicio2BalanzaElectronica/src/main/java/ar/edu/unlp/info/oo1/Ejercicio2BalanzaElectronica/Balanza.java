package ar.edu.unlp.info.oo1.Ejercicio2BalanzaElectronica;

public class Balanza {
	 private int cantidadProductos;
	 private double precioTotal;
	 private double pesoTotal;
	 
	 public Balanza() {
		 this.ponerEnCero();//utiliza el metodo de poner en cero para no repetir codigo
	 }
	 public int getCantidadDeProductos(){
		 return this.cantidadProductos;
	 }
	 public double getPrecioTotal(){
		 return this.precioTotal;
	 }
	 public double getPesoTotal(){
		 return this.pesoTotal;
	 }
	 public void ponerEnCero() {
		 this.cantidadProductos = 0;
		 this.precioTotal = 0;
		 this.pesoTotal = 0;
	 }
	 public void agregarProducto(Producto prod){
		 this.cantidadProductos = this.cantidadProductos + 1;
		 this.precioTotal = this.precioTotal + prod.getPrecio();
		 this.pesoTotal = this.pesoTotal + prod.getPeso();
	 }
	 public Ticket emitirTicket() {
		 Ticket ticket =  new Ticket(this.getCantidadDeProductos(),this.getPesoTotal(),this.getPrecioTotal());
		 return ticket;
	 }
	 
}
