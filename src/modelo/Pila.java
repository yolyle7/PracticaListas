package modelo;

import java.util.LinkedList;

public class Pila  implements Pilable{

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Colores desApilar() {
		// TODO Auto-generated method stub
		return null;
	}

}
