package ar.edu.unlp.info.oo1.Ejercicio8GenealogiaSalvaje;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	public Mamifero(String identificador) {
		this.identificador = identificador;
		this.madre = null;
		this.padre = null;
	}
	public Mamifero(){
		this.madre = null;
		this.padre = null;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getIdentificador() {
		return this.identificador;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getEspecie() {
		return this.especie;
	}
	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento = fecha;
	}
	public LocalDate getFechaNacimiento(){
		return this.fechaNacimiento;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getMadre() {
		return this.madre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getPadre() {
		return this.padre;
	}
	public Mamifero getAbueloPaterno(){
		Mamifero abuelo = null;
		if(this.padre!=null) {
			abuelo = this.padre.getPadre();
		}
		return abuelo;
	}
	public Mamifero getAbuelaPaterna(){
		Mamifero abuela = null;
		if(this.padre !=null) {
			abuela = this.padre.getMadre();
		}
		return abuela;
		
	}
	public Mamifero getAbueloMaterno(){
		Mamifero abuelo = null;
		if(this.madre!=null) {
			abuelo = this.madre.getPadre();
		}
		return abuelo;
	}
	public Mamifero getAbuelaMaterna(){
		Mamifero abuela = null;
		if(this.madre !=null) {
			abuela = this.madre.getMadre();
		}
		return abuela;
		
	}
	public boolean tieneComoAncestroA(Mamifero mamifero){
		boolean encontrado = false;
		if(this.padre!=null) {
			if(this.padre == mamifero) {
				encontrado = true;
			}else {
				encontrado = this.getPadre().tieneComoAncestroA(mamifero);
			}
		}
		if(!encontrado){
			if(this.madre!=null) {
				if(this.madre == mamifero) {
					encontrado = true;
				}else {
					encontrado = this.getMadre().tieneComoAncestroA(mamifero);
				}
			}
		}
		return encontrado;	
	}
}