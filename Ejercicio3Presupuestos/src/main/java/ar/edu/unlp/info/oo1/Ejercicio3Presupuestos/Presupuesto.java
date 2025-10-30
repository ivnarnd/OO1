package ar.edu.unlp.info.oo1.Ejercicio3Presupuestos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
    private LocalDate fecha;
    private String cliente;
    private List<Item> items;
    
    public Presupuesto(String cliente){
    	this.fecha = LocalDate.now();
    	this.cliente = cliente;
    	this.items = new ArrayList<Item>();
    }
    public String getCliente() {
    	return this.cliente;
    }
    public LocalDate getFecha() {
    	return this.fecha;
    }
    public void agregarItem(Item i){
    	items.add(i);
    }
    public double calcularTotal(){
    	double total = items.stream().mapToDouble(item -> item.costo()).sum();
    	System.out.println(total);
    	return total;
    }
}
