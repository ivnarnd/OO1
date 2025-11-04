package ar.edu.unlp.info.oo1.Ejercicio10MethodLookUp;

public class TestGerente {
	public static void main(String[]args) {
		Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes();
		System.out.println("Aportes de Alan: ");
		System.out.print(aportesDeAlan);
		double sueldoBasicoDeAlan = alan.sueldoBasico();
		System.out.println("Sueldo Basico de Alan");
		System.out.println(sueldoBasicoDeAlan);
	}
}
