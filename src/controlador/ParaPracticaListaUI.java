package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.desplegablePedirColor;
import vista.vistaUI;

public class ParaPracticaListaUI extends vistaUI{

	public ParaPracticaListaUI(){
		
		vistaUno.setVisible(true);	
		vistaDos.setVisible(false);
		
		vistaUno.getCogerBtnJugar().addActionListener(new ActionListener () {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
