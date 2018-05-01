package controlador;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JLabel;
import javax.swing.JTextField;

import logica.Acciones;
import modelo.Colores;
import vista.desplegablePedirColor;
import vista.desplegableSeleccionColor;
import vista.vistaUI;

public class ParaPracticaListaUI extends vistaUI{
	
	private Acciones acciones= new Acciones();
	private desplegableSeleccionColor slctColor = new desplegableSeleccionColor();
	private desplegablePedirColor pdColor = new desplegablePedirColor();

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
			public void actionPerformed(ActionEvent arg0) {
				slctColor.setVisible(false);
				
			}
		});
		
		vistaDos.getCogerCabecera().getCogerBtnPedirColor().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				pdColor.setVisible(true);
				
			}
		});
		
		pdColor.getCogerComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				pdColor.setVisible(false);
				
			}
		});
	}
}
