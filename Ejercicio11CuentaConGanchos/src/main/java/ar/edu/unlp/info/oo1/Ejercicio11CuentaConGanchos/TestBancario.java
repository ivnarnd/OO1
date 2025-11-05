package ar.edu.unlp.info.oo1.Ejercicio11CuentaConGanchos;

public class TestBancario {
	public static void main(String[]args) {
		Cuenta cuentaCorriente1 =  new CuentaCorriente();
		Cuenta cajaDeAhorro1 = new CajaDeAhorro();
		cuentaCorriente1.depositar(2000);
		cuentaCorriente1.transferirACuenta(1400.0, cajaDeAhorro1);
		System.out.println(cuentaCorriente1.getSaldo());
		System.out.println(cajaDeAhorro1.getSaldo());
	}
}
