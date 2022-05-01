package ar.edu.unlp.info.oo2.practica2_ejercicio4;

public class Planta extends Empleado{
	private boolean casado;
	private int hijos;
	private int anios;
	
	public Planta(int hijos, boolean casado, int anios) {
		super(50000);
		this.casado = casado;
		this.hijos = hijos;
		this.anios = anios;
	}

	@Override
	public float base() {
		return this.getMonto();
	}

	@Override
	public float adicional() {
		return (casado?5000:0)+2000*this.hijos+2000*this.anios;
	}
}
