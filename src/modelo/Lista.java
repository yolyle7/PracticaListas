package modelo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lista implements Listable{

	private LinkedList<Colores> lista;
	
	public Lista(){
		super();
	}
	
	
	public LinkedList<Colores> getLista() {
		return lista;
	}


	public void setLista(LinkedList<Colores> lista) {
		this.lista = lista;
	}


	@Override
	public void addLista(Colores color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int borrarColores(ArrayList<Integer> posiciones) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Integer> recorrerAutomatico() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Integer> busquedaColor(Colores color) {
		// TODO Auto-generated method stub
		return null;
	}

}
