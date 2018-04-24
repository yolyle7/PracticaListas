package test;

import static org.junit.jupiter.api.Assertions.*;
import junit.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelo.Colores;

class ColoresTest {
	
	ArrayList<Colores> repetidos = new ArrayList<>();


	@Test
	void testSortearColor() {
		repetidos.add(Colores.azul);
		Colores instancia=new Colores(repetidos);	
		for (int i = 0; i < 100; i++) {
			assertNotEquals("azul", instancia);
		}
	}
}
//Arraylist repetidos;
//repetidos.add(colores.azul);
//instancia.sortearcolor(repetidos);
//for i=100;
//nunca salga el azul. assertEquals