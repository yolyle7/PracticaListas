package modelo;

import java.util.LinkedList;

public class Pila implements Pilable {

	private LinkedList<Colores> pila;

	public Pila() {
		super();
	}

	public LinkedList<Colores> getPila() {
		return pila;
	}

	public void setPila(LinkedList<Colores> pila) {
		this.pila = pila;
	}

	@Override
	public void apilar(Colores color) {
		this.pila.addLast(color);

	}

	@Override
	public Colores desApilar() {
		return this.pila.removeLast();
	}

}
