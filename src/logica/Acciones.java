package logica;

import java.awt.Color;
import java.awt.TextField;
import java.util.ArrayList;

import javax.swing.*;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import modelo.Colores;
import utiles.Constantes;

public class Acciones implements Accionable{
	
	private Datos dato = new Datos();

	@Override
	public ArrayList<Colores> seleccionarColor(ArrayList<Colores> repetidos,int ronda) {
		
		ArrayList<Colores> sltColores = new ArrayList<Colores>();
		
		Colores colorDos;
		Colores colorTres;
		Colores colorUno = dato.sortearColor(repetidos);
		
		do{
			colorDos = dato.sortearColor(repetidos);	
		}while(colorUno.equals(colorDos));
		
		do{
			colorTres = dato.sortearColor(repetidos);
		}while((colorTres.equals(colorUno)) || (colorTres.equals(colorDos)));
		
		
		sltColores.add(colorUno);
		sltColores.add(colorDos);
		sltColores.add(colorTres);
		
		aumentarRonda(repetidos,ronda);
		
		
		
		return sltColores;
	}

	public void aumentarRonda(ArrayList<Colores> repetidos,int ronda) {
		ronda++;
		if(ronda==5){
			ronda=0;
			repetidos.clear();
		}
	}

	//no está hecho
	@Override
	public Colores pedirColor() {
		return null;
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

	public Datos getDato() {
		return dato;
	}

	public void setDato(Datos dato) {
		this.dato = dato;
	}
	
	public void crearColaJlabel(JPanel panelito){
		panelito.removeAll();
		int comienzo=0;
		for (int i = 0; i < Constantes.tamanioCola; i++) {
			JLabel etiqueta= new JLabel();
			etiqueta.setBounds(comienzo,0,Constantes.separacionEtiquetasCola,35);
			comienzo+=Constantes.separacionEtiquetasCola;
			etiqueta.setName(""+i);
			etiqueta.setVisible(true);
			etiqueta.setBackground(dato.getCola().getCola().get(i).getColor());
			etiqueta.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			etiqueta.setOpaque(true);
			panelito.add(etiqueta);
		}
	}

}
