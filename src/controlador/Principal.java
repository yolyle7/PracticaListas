package controlador;

import java.awt.EventQueue;

import vista.vistaUI;

public class Principal {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaPracticaListaUI frame = new ParaPracticaListaUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
