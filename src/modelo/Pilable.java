package modelo;

public interface Pilable {

	/**
	 * Añade un color al final de la pila
	 * @param color
	 */
	public void apilar(Colores color);

	/**
	 * Elimina el color del final de la pila
	 * @return pila
	 */
	public Colores desApilar();
}
