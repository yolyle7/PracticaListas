package test;

import junit.*;

import java.util.ArrayList;

import modelo.Colores;

class ColoresTest {
	ArrayList<Colores> repetidos = new ArrayList<>();
	Colores azul = Colores.azul;

	/*@Test
	void testSortearColor() {
		repetidos.add(Colores.azul);
		for (int i = 0; i < 100; i++) {
			assertNotEquals(azul, repetidos); 
			
		}