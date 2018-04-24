package modelo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Prueba {

	public static void main(String[] args) {
	/*	Lista lista= new Lista();
		lista.addLista(Colores.amarillo);
		lista.addLista(Colores.azul);
		lista.addLista(Colores.azul);
		lista.addLista(Colores.azul);
		//System.out.println(lista.getLista().getFirst().toString()); 
		//System.out.println(lista.getLista().toString()); Para visualizarla toda
		
		//Busqueda color
		
		System.out.println(lista.busquedaColor(Colores.amarillo));
		
		//Borrar colores
		
		ArrayList<Integer> posiciones= new ArrayList<Integer>();
		posiciones.add(0);
		posiciones.add(1);
		System.out.println(lista.borrarColores(posiciones));*/
		
		Datos datos= new Datos();
		/*ArrayList<Colores> repetidos= new ArrayList<Colores>();
		repetidos.add(Colores.azul);
		repetidos.add(Colores.azul);
		for (int i = 0; i < 100; i++) {
			System.out.println((datos.sortearColor(repetidos)).toString());
		}*/
		
		datos.getPilaUno().apilar(Colores.rojo);
		datos.getPilaUno().apilar(Colores.azul);
		datos.getPilaDos().apilar(Colores.amarillo);
		datos.getPilaDos().apilar(Colores.rojo);
	
		datos.equilibrarPilas();
	
		//la habia cagado, pero tranquis que ya va

	}
	
}

