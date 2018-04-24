<<<<<<< HEAD
package modelo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Prueba {

	public static void main(String[] args) {
		Lista lista= new Lista();
		lista.addLista(Colores.amarillo);
		lista.addLista(Colores.azul);
		lista.addLista(Colores.azul);
		lista.addLista(Colores.azul);
		//System.out.println(lista.getLista().getFirst().toString()); 
		//System.out.println(lista.getLista().toString()); Para visualizarla toda
		
		//Busqueda color
		
		//System.out.println(lista.busquedaColor(Colores.amarillo));
		
		//Borrar colores
		
		//System.out.println(lista.busquedaColor(Colores.amarillo));
		//ArrayList<Integer> posiciones= new ArrayList<Integer>();
		//posiciones.add(0);
		//System.out.println(lista.borrarColores(posiciones));
		
		
		
		
	}
	
	
}
=======
package modelo;

public class Prueba {
	public static void main(String[] args) {
		Lista instancia = new Lista();
		instancia.addLista(Colores.amarillo);
		instancia.addLista(Colores.naranja);
		instancia.addLista(Colores.naranja);
		instancia.addLista(Colores.azul);
		System.out.println(instancia.busquedaColor(Colores.naranja));
	}
}
>>>>>>> b26a3e92c82ea62f77df815f56fb44ad73760a40
