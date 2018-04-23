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

	@Override
	public void enColar(Colores color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Colores desEncolar() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
