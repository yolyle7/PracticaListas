package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class vistaUI extends JFrame {

	private JPanel contentPane;
	protected vistaUno vistaUno;
	protected vistaDos vistaDos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaUI frame = new vistaUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public vistaUI() {
		vistaUno= new vistaUno();
		vistaDos= new vistaDos();
		
	}

}
