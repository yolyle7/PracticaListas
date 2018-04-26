package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

public class panelDos extends JPanel {

	/**
	 * Create the panel.
	 */
	public panelDos() {
		setBackground(new Color(255, 255, 153));
		setBorder(null);
		setLayout(null);
		
		JButton button = new JButton("Seleccion Color");
		button.setForeground(new Color(0, 0, 102));
		button.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button.setBackground(new Color(153, 204, 255));
		button.setBounds(55, 11, 149, 45);
		button.setFont(new Font("Give You Glory", Font.BOLD | Font.ITALIC, 18));
		add(button);
		
		JButton btnPedirColor = new JButton("Pedir Color");
		btnPedirColor.setForeground(new Color(0, 0, 102));
		btnPedirColor.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnPedirColor.setBackground(new Color(153, 204, 255));
		btnPedirColor.setBounds(214, 11, 157, 45);
		btnPedirColor.setFont(new Font("Give You Glory", Font.BOLD | Font.ITALIC, 18));
		add(btnPedirColor);
		
		JButton btnBarajarPilas = new JButton("Barajar Pilas");
		btnBarajarPilas.setForeground(new Color(0, 0, 102));
		btnBarajarPilas.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnBarajarPilas.setBackground(new Color(153, 204, 255));
		btnBarajarPilas.setBounds(381, 11, 167, 45);
		btnBarajarPilas.setFont(new Font("Give You Glory", Font.BOLD | Font.ITALIC, 18));
		add(btnBarajarPilas);
		
		JButton btnBorrarcolor = new JButton("Borrar Color");
		btnBorrarcolor.setForeground(new Color(0, 0, 102));
		btnBorrarcolor.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnBorrarcolor.setBackground(new Color(153, 204, 255));
		btnBorrarcolor.setBounds(558, 11, 161, 45);
		btnBorrarcolor.setFont(new Font("Give You Glory", Font.BOLD | Font.ITALIC, 18));
		add(btnBorrarcolor);

	}

}
