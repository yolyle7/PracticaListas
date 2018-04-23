package modelo;

import java.awt.Color;
import java.util.ArrayList;

public enum Colores implements Coloreable{

	rojo(Color.red, "rojo"), amarillo(Color.YELLOW, "amarillo"), azul(Color.BLUE, "azul"), verde(Color.GREEN,
			"verde"), naranja(Color.orange, "naranja");
	private Color color;
	private String nombre;

	private Colores(Color color, String nombre) {
		this.color = color;
		this.nombre = nombre;
	}

	public Color getColor() {
		return color;
	}

	public static int getCantidadElementos() {
		return Colores.values().length;
	}

	public static Colores getElement(int i) {
		return Colores.values()[i];
	}

	@Override
	public String toString() {
		return this.nombre;
	}

	@Override
	public Colores sortearColor(ArrayList<Colores> repetidos) {
		// TODO Auto-generated method stub
		return null;
	}
	//
}
