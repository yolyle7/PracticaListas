package logica;

import modelo.Colores;

public interface Accionable {

	/**
	 * Acción que llama a todas las demás y que es la única línea en el paraUI;
	 */
	public void accionPrincipal();
	
	/**
	 * Usa el método de datos "sortearColor" para dar tres colores.
	 */
	public void seleccionarColor();
	
	/**
	 * Da a elegir los cinco colores sin tener en cuenta los repetidos. Solo se puede hacer cinco veces
	 */
	public Colores pedirColor();
	
	/**
	 * Usa el método "equilibrarPilas" de Datos para barajarlas y ponerlas al mismo tamaño (si es impar la primera es la peque)
	 */
	public void barajar();
	
	/**
	 * Elige un color y lo borra de la lista. Usa el método "busquedaColor" de lista.
	 */
	public void borrarColor(Colores color);
}
