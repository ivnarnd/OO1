package ar.edu.unlp.info.oo1.Ejercicio11CuentaConGanchos;

public abstract class Cuenta {
	private double saldo;
	public Cuenta() {
		this.saldo = 0;
	}
	public double getSaldo(){
		return this.saldo;
	}
	public void depositar(double monto){
		this.saldo = this.saldo + monto;
	}
	public boolean extraer(double monto) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}else {
			return false;
		}
	}
	public boolean transferirACuenta(double monto,Cuenta destino){
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			destino.depositar(monto);
			return true;
		}else {
			return false;
		}
	}
	protected void extraerSinControlar(double monto) {
		this.saldo = this.saldo - monto;
	}
	
	protected abstract boolean puedeExtraer(double monto);
	
	
}
