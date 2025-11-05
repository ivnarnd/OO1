package ar.edu.unlp.info.oo1.Ejercicio11CuentaConGanchos;

public class CajaDeAhorro extends Cuenta {
	
	@Override
	protected boolean puedeExtraer(double monto) {
		double costo = monto * 0.2;
		return this.getSaldo() >= monto+costo;
	}
	
}
