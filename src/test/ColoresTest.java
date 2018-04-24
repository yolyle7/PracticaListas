package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelo.Colores;

class ColoresTest {
	ArrayList<Colores> repetidos = new ArrayList<>();
	Colores azul = Colores.azul;

	@Test
	void testSortearColor() {
		repetidos.add(Colores.azul);
		for (int i = 0; i < 100; i++) {
			assertNotEquals(azul, repetidos);
			
		}
	}
}