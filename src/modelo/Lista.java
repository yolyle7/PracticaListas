package modelo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lista implements Listable{
	
	private LinkedList<Colores> lista;
	
	public Lista(){
		super();
		this.lista=new LinkedList<Colores>();
	}
	
	
	public LinkedList<Colores> getLista() {
		return lista;
	}

	public void setLista(LinkedList<Colores> lista) {
		this.lista = lista;
	}

	@Override
	public void addLista(Colores color) {
		this.lista.add(color);
	}
	
	
	@Override
	public int borrarColores(ArrayList<Integer> posiciones) {
		
		for (int i = 0; i < posiciones.size(); i++) {
			this.lista.remove(posiciones.get(i));
		}
		return posiciones.size();
	}

	@Override
	public ArrayList<Integer> recorrerAutomatico() {
		 ArrayList<Integer> posiciones = new  ArrayList<Integer>();
		
		for (int i = 0; i < lista.size()-2; i++) {
			if((lista.get(i).equals(lista.get(i+1))) && ((lista.get(i+1))).equals(lista.get(i+2))){
				posiciones.add(i);
				posiciones.add(i+1);
				posiciones.add(i+2);
			}
		}
		return posiciones;
	}

	@Override
	public ArrayList<Integer> busquedaColor(Colores color) {
		ArrayList<Integer> posiciones = new ArrayList<Integer>();
		
		for (int i = 0; i < lista.size(); i++) {
			if(lista.contains(color)){
				posiciones.add(i);
			}
		}
		return posiciones;
	}

	


}
