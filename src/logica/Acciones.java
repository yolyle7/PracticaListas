package logica;

import java.util.ArrayList;

import modelo.Colores;

public class Acciones implements Accionable{
	
	private int ronda =0;
	private Datos dato = new Datos();
	private ArrayList<Colores> repetidos = new ArrayList<Colores>();
	

	@Override
	public void accionPrincipal() {
		seleccionarColor();
		pedirColor();
		barajar();
		borrarColor(Colores.amarillo);
		
	}

	@Override
	public void seleccionarColor() {
		Colores colorDos;
		Colores colorTres;
		Colores colorUno = dato.sortearColor(repetidos);
		
		do{
			colorDos = dato.sortearColor(repetidos);	
		}while(colorUno.equals(colorDos));
		
		do{
			colorTres = dato.sortearColor(repetidos);
		}while((colorTres.equals(colorUno)) || (colorTres.equals(colorDos)));
		
		
		
		aumentarRonda(repetidos);
	}

	public void aumentarRonda(ArrayList<Colores> repetidos) {
		this.ronda++;
		System.out.println(ronda);
		if(this.ronda==5){
			this.ronda=0;
			repetidos.clear();
		}
	}

	//no está hecho
	@Override
	public Colores pedirColor() {
		return Colores.amarillo;
		
	}

	@Override
	public void barajar() {
		this.dato.equilibrarPilas();
		
	}

	@Override
	public void borrarColor(Colores color) {
		this.dato.getLista().borrarColores(this.dato.getLista().busquedaColor(color));
		
	}

}
