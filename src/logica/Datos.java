package logica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import modelo.Cola;
import modelo.Colores;
import modelo.Lista;
import modelo.Pila;

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
	 * coge las dos pilas y las deja del mismo tamaño (y si es impar el primero lo deja mas peque) funciona perfecto
	 */
	public void equilibrarPilas() {
		int largo= (this.pilaUno.getPila().size()+this.pilaDos.getPila().size())/2;
		LinkedList<Colores> pilaParcial= new LinkedList<Colores>();
		rellenarPilaParcial(pilaParcial);
		System.out.println("pilaparcial rellenada: "+pilaParcial.toString());
		desordenarColores(pilaParcial);
		System.out.println("pilaParcial rellenada y desordenada: "+pilaParcial.toString());
		rellenarDeNuevoPilas(pilaParcial, largo);
		
		
	}
	private void desordenarColores(LinkedList<Colores> pilaParcial){

		for (int i = 0; i < 100; i++) {
			int aleatorio= (int) (Math.random()*pilaParcial.size());
			Colores color= pilaParcial.remove(aleatorio);
			pilaParcial.add(color);
		}
	}
	private void rellenarDeNuevoPilas(LinkedList<Colores>pilaParcial,int largo){
		int numeroParcial=0;
		for (Iterator iterator = pilaParcial.iterator(); iterator.hasNext();) {
			Colores color = (Colores) iterator.next();
			if(numeroParcial<largo){
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

		for (Iterator iterator = pilaUno.getPila().iterator(); iterator.hasNext();) {
			Colores colores = (Colores) iterator.next();
			pilaParcial.add(pilaUno.getPila().getFirst());
			iterator.remove();
		}
		
		for (Iterator iterator = pilaDos.getPila().iterator(); iterator.hasNext();) {
			Colores colores = (Colores) iterator.next();
			pilaParcial.add(pilaDos.getPila().getFirst());
			iterator.remove();
			
		}
	}

	/**
	 * Hacer generarCol()
	 * @return
	 */
	public LinkedList<Colores> generarCola() {
		return null;
	}
	
	public Colores sortearColor(ArrayList<Colores> repetidos) {
		boolean salir= true;
		int index=0;
		do{
			index = (int) (Math.random()*(Colores.getCantidadElementos()));
			
			salir=true;
			for (int i = 0; i < repetidos.size(); i++) {
				if(Colores.getElement(index).equals(repetidos.get(i))){
					salir= false;
				}
			}
			
		}while(!salir);
	
		return Colores.values()[index];
	}
}
