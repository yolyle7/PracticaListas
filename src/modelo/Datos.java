package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Datos {

	private Lista lista = new Lista();
	private Cola cola = new Cola(generarCola());
	private Pila pilaUno = new Pila();
	private Pila pilaDos = new Pila();

	public Datos(){
		super();
	}

	public Lista getLista() {
		return lista;
	}

	public void setLista(Lista lista) {
		this.lista = lista;
	}

	public Cola getCola() {
		return cola;
	}

	public void setCola(Cola cola) {
		this.cola = cola;
	}

	public Pila getPilaUno() {
		return pilaUno;
	}

	public void setPilaUno(Pila pilaUno) {
		this.pilaUno = pilaUno;
	}

	public Pila getPilaDos() {
		return pilaDos;
	}

	public void setPilaDos(Pila pilaDos) {
		this.pilaDos = pilaDos;
	}

	/**
	 * coge las dos pilas y las deja del mismo tamaño
	 */
	public void equilibrarPilas() {
		int largo= 0;
		//largo va bien
		largo= (this.pilaUno.getPila().size()+this.pilaDos.getPila().size())/2;
		//pilaParcial se rellena bien
		LinkedList<Colores> pilaParcial= new LinkedList<Colores>();
		rellenarPilaParcial(pilaParcial);
		System.out.println("Pila parcial antes de quitar"+pilaParcial);
		System.out.println("PilaUno al rellenar pilaParcial: "+this.pilaUno.getPila().toString());
		System.out.println("PilaDos al rellenar pilaParcial: "+this.pilaDos.getPila().toString());
		rellenarDeNuevoPilas(pilaParcial, largo);
		System.out.println("Pila parcial despues de quitar las cosas: ");
		System.out.println("pila uno: "+this.pilaUno.getPila().toString());
		System.out.println("pila dos: "+this.pilaDos.getPila().toString());
		
		
	}
	private void rellenarDeNuevoPilas(LinkedList<Colores>pilaParcial,int largo){
		int numeroParcial=0;
		for (Iterator iterator = pilaParcial.iterator(); iterator.hasNext();) {
			Colores color = (Colores) iterator.next();
			if(numeroParcial<=largo){
				this.pilaUno.apilar(color);
				
			}
			else{
				this.pilaDos.apilar(color);
			}
			numeroParcial++;
		}
	}
	
	private void rellenarPilaParcial(LinkedList<Colores>pilaParcial)
	{

		pilaParcial.addAll(this.pilaUno.getCollection());
		pilaUno.removeCollection();
		
		pilaParcial.addAll(this.pilaDos.getCollection());
		pilaUno.removeCollection();
	}

	public LinkedList<Colores> generarCola() {
		return null;
	}
	
	public Colores sortearColor(ArrayList<Colores> repetidos) {
		boolean salir= true;
		int i=0;
		do{
			i = (int) (Math.random()*Colores.values().length)+1;
			
			salir=true;
			for (int k = 0; k < repetidos.size(); k++) {
				if(Colores.values()[i].equals(repetidos.get(k))){
					salir= false;
				}
			}
			
		}while(!salir);
	
		return Colores.values()[i];
	}
}
