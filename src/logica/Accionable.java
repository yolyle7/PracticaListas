package logica;

import modelo.Colores;

public interface Accionable {

	/**
	 * Acci�n que llama a todas las dem�s y que es la �nica l�nea en el paraUI;
	 */
	public void accionPrincipal();
	
	/**
	 * Usa el m�todo de datos "sortearColor" para dar tres colores.
	 */
	public void seleccionarColor();
	
	/**
	 * Da a elegir los cinco colores sin tener en cuenta los repetidos. Solo se puede hacer cinco veces
	 */
	public Colores pedirColor();
	
	/**
	 * Usa el m�todo "equilibrarPilas" de Datos para barajarlas y ponerlas al mismo tama�o (si es impar la primera es la peque)
	 */
	public void barajar();
	
	/**
	 * Elige un color y lo borra de la lista. Usa el m�todo "busquedaColor" de lista.
	 */
	public void borrarColor(Colores color);
}
