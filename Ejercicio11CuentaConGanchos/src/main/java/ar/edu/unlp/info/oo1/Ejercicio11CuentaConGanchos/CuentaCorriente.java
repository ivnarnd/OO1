package ar.edu.unlp.info.oo1.Ejercicio11CuentaConGanchos;

public class CuentaCorriente extends Cuenta {
	private double descubierto;
	public CuentaCorriente() {
		super();
		this.descubierto = 0;
	}
	public double getDescubierto(){
		return this.descubierto;
	}
	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	@Override
	protected boolean puedeExtraer(double monto) {
		if(this.getSaldo()+this.getDescubierto() >= monto){
			return true;
		}else{
			return false;
		}
	}
	protected void extraerSinControlar(double monto){
		double montoDesc = monto - this.getSaldo();
		if(montoDesc <= 0){
			super.extraerSinControlar(monto);
		}else {
			super.extraerSinControlar(monto-montoDesc);
			this.descubierto = this.descubierto - montoDesc;
		}		
	}

}
