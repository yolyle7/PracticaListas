package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logica.Acciones;
import vista.desplegablePedirColor;
import vista.vistaUI;

public class ParaPracticaListaUI extends vistaUI{
	
	private Acciones acciones= new Acciones();

	public ParaPracticaListaUI(){
		
		vistaUno.setVisible(true);	
		vistaDos.setVisible(false);
		
		vistaUno.getCogerBtnJugar().addActionListener(new ActionListener () {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				vistaDos.setVisible(true);
				vistaUno.setVisible(false);
				vistaDos.getCogerCentro().setCambiarCola(acciones.getDato().generarCola());

			}
		});
	}
}
