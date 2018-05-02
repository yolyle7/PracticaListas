package controlador;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
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
	private ArrayList<Colores> repetidos= new ArrayList<Colores>();

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

				desplegablePedirColor pdColor= new desplegablePedirColor();
				pdColor.setVisible(true);
				Colores colorParcial=(Colores) pdColor.getCogerComboBox().getSelectedItem();
				JLabel etiqueta= new JLabel();
				etiqueta.setBackground(colorParcial.getColor());
				etiqueta.setOpaque(true);
				etiqueta.setBounds(0,0,30,30);
				vistaDos.getCogerCentro().getCogerPilaUno().add(etiqueta);
				etiqueta.setVisible(true);
			}
		});
		
	
	}

	public Acciones getAcciones() {
		return acciones;
	}

	public void setAcciones(Acciones acciones) {
		this.acciones = acciones;
	}

	public desplegableSeleccionColor getSlctColor() {
		return slctColor;
	}

	public void setSlctColor(desplegableSeleccionColor slctColor) {
		this.slctColor = slctColor;
	}

	/*public desplegablePedirColor getPdColor() {
		return pdColor;
	}

	public void setPdColor(desplegablePedirColor pdColor) {
		this.pdColor = pdColor;
	}
*/
	public ArrayList<Colores> getRepetidos() {
		return repetidos;
	}

	public void setRepetidos(ArrayList<Colores> repetidos) {
		this.repetidos = repetidos;
	}

	/*public Colores getColorParcial() {
		return colorParcial;
	}

	public void setColorParcial(Colores colorParcial) {
		this.colorParcial = colorParcial;
	}*/
	
	
}
