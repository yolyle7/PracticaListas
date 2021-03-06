package modelo;

import java.util.ArrayList;

public interface Listable {

	/**
	 * A�ade un color a la lista
	 * @param color
	 */
	public void addLista(Colores color);
	
	/**
	 * Borra los colores en las posiciones que se pasan por par�metro. Devuelve el n�mero de monedas que hemos obtenido 
	 * al borrar los colores
	 * @param posiciones
	 * @return
	 */
	public int borrarColores(ArrayList<Integer> posiciones);
	
	/**
	 * recorre la lista y devuelve las posiciones con colores repetidos en tres posiciones seguidas
	 * @return numero de monedas
	 */
	public ArrayList<Integer> recorrerAutomatico();
	
	/**
	 * Busca x color y devuelve las posiciones donde lo encuentra
	 * @param color
	 * @return
	 */
	public ArrayList<Integer> busquedaColor(Colores color);
}
