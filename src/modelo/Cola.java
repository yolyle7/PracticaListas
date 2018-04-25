package modelo;

import java.util.LinkedList;

public class Cola implements Coleable{
	
	private LinkedList<Colores> cola;
	

	public Cola(LinkedList<Colores> cola) {
		super();
		this.cola = cola;
	}
	
	

	public LinkedList<Colores> getCola() {
		return cola;
	}



	public void setCola(LinkedList<Colores> cola) {
		this.cola = cola;
	}
//lol

	@Override
	public void enColar(Colores color) {
		this.cola.addLast(color);
		
	}

	@Override
	public Colores desEncolar() {
		return this.cola.removeFirst();
	}

	

}
