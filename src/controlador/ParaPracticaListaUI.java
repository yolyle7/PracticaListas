package controlador;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;

import logica.Acciones;
import modelo.Colores;
import vista.desplegablePedirColor;
import vista.desplegableSeleccionColor;
import vista.vistaUI;

public class ParaPracticaListaUI extends vistaUI{
	
	private Acciones acciones= new Acciones();
	private desplegableSeleccionColor slctColor = new desplegableSeleccionColor();
	private desplegablePedirColor pdColor = new desplegablePedirColor();
	private ArrayList<Colores> repetidos= new ArrayList<Colores>();
	private Colores colorParcial;

	public ParaPracticaListaUI(){
		
		vistaUno.setVisible(true);	
		vistaDos.setVisible(false);
		
		vistaUno.getCogerBtnJugar().addActionListener(new ActionListener () {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				vistaDos.setVisible(true);
				vistaUno.setVisible(false);
				
				acciones.crearColaJlabel(vistaDos.getCogerCentro().getCogerCola());
				

			}
		});
		
        vistaDos.getCogerCabecera().getCogerBtnSeleccionColor().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				slctColor.setVisible(true);
				
			}
		});
		
		
        slctColor.getCogerComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				slctColor.setVisible(false);
				
			}
		});
		
		vistaDos.getCogerCabecera().getCogerBtnPedirColor().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				pdColor.setVisible(true);
				JLabel etiqueta= new JLabel();
				//etiqueta.setBackground(colorParcial.getColor());
				etiqueta.setBackground(Colores.azul.getColor());
				etiqueta.setText("pato");
				etiqueta.setOpaque(true);
				etiqueta.setBounds(0,0,300,300);
				vistaDos.getCogerCentro().add(etiqueta);
				etiqueta.setVisible(true);
				
			}
		});
		
		pdColor.getCogerComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pdColor.setVisible(false);
				colorParcial=acciones.convertirColorDesplegable(pdColor.getCogerComboBox().getSelectedItem().toString());
			}
		});
	}
}
