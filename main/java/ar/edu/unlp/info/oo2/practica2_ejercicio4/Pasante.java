package ar.edu.unlp.info.oo2.practica2_ejercicio4;

public class Pasante extends Empleado{
	
	private int examenes;
	
	public Pasante(int examenes) {
		super(20000);
		this.examenes = examenes;
	}

	@Override
	public float base() {
		return this.getMonto();
	}

	@Override
	public float adicional() {
		return this.examenes * 2000;
	}
	
}
