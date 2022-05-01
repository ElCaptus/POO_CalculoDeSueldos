package ar.edu.unlp.info.oo2.practica2_ejercicio4;

public class Temporario extends Empleado{
	private boolean casado;
	private int cantHijos;
	private int cantHoras;
	
	public Temporario(int horas, int hijos, boolean casado) {
		super(20000);
		this.cantHijos = hijos;
		this.cantHoras = horas;
		this.casado = casado;
	}

	@Override
	public float base() {
		return this.getMonto() + this.cantHoras*300;
	}

	@Override
	public float adicional() {
		return (casado? 5000 : 0)+this.cantHijos*2000;
	}
	
}
