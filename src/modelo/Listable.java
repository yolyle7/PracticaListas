package modelo;

import java.util.ArrayList;

public interface Listable {

	public void addLista(Colores color);
	public int borrarColores(ArrayList<Integer> posiciones);
	public ArrayList<Integer> recorrerAutomatico();
	public ArrayList<Integer> busquedaColor(Colores color);
}
