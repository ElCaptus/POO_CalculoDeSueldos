package ar.edu.unlp.info.oo2.practica2_ejercicio4;

public abstract class Empleado {
	private float monto;
	
	public Empleado(float monto) {
		this.monto = monto;
	}
	
	public float sueldo() {
		return this.base()+this.adicional()-this.descuento();
	}
	
	public float getMonto() {
		return this.monto;
	}
	
	public abstract float base();
	public abstract float adicional();
	
	public float descuento() {
		return (float) (this.base()*0.13 + this.adicional()*0.05);
	}
	
}
