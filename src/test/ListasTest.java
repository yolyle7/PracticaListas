package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import modelo.Colores;
import modelo.Lista;

public class ListasTest {

	Lista lista= new Lista();
	
	@Test
	public void borrarColoresTest() {
		lista.addLista(Colores.amarillo);
		lista.addLista(Colores.azul);
		ArrayList<Integer> posiciones= new ArrayList<>();
		posiciones.add(0);
		lista.borrarColores(posiciones);
		assertEquals(1, lista.getLista().size());
	}
	
	@Test
	public void recorrerAutomaticoTest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void busquedaColorTest() {
		fail("Not yet implemented");
	}
	
}
