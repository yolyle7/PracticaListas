package logica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JLabel;

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
	
	public LinkedList<JLabel> generarColoresCola(){
		LinkedList<Colores> cola= this.dato.generarCola();
		LinkedList<JLabel> colaVista= new LinkedList<JLabel>();
		for (Iterator iterator = cola.iterator(); iterator.hasNext();) {
			Colores color = (Colores) iterator.next();
			JLabel colorVista= new JLabel();
			colorVista.setBackground(color.getColor());
		}
		return colaVista;
	}

	public int getRonda() {
		return ronda;
	}

	public void setRonda(int ronda) {
		this.ronda = ronda;
	}

	public Datos getDato() {
		return dato;
	}

	public void setDato(Datos dato) {
		this.dato = dato;
	}

	public ArrayList<Colores> getRepetidos() {
		return repetidos;
	}

	public void setRepetidos(ArrayList<Colores> repetidos) {
		this.repetidos = repetidos;
	}
	
	

}
