package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;

public class panelUno extends JPanel {
	private JTextField textField;
	private JTextField txtMensaje;
	private JPanel cola;
	private JPanel pilaUno;
	private JPanel pilaDos;
	private JPanel lista;
	private JLabel lblCola;
	private JLabel lblPilaUno;
	private JLabel lblPilaDos;
	private JLabel lblLista;
	private JLabel lblIconoMonedas;

	/**
	 * Create the panel.
	 */
	public panelUno() {
		setBackground(new Color(255, 255, 153));
		setLayout(null);

		cola = new JPanel();
		cola.setBackground(Color.WHITE);
		cola.setBounds(162, 51, 393, 25);
		add(cola);

		pilaUno = new JPanel();
		pilaUno.setBackground(Color.WHITE);
		pilaUno.setBounds(162, 113, 322, 25);
		add(pilaUno);

		pilaDos = new JPanel();
		pilaDos.setBackground(Color.WHITE);
		pilaDos.setBounds(162, 149, 322, 25);
		add(pilaDos);

		lista = new JPanel();
		lista.setBackground(Color.WHITE);
		lista.setBounds(183, 221, 449, 125);
		add(lista);

		lblCola = new JLabel("Cola");
		lblCola.setForeground(new Color(0, 0, 102));
		lblCola.setFont(new Font("Give You Glory", Font.BOLD | Font.ITALIC, 16));
		lblCola.setBounds(49, 51, 67, 25);
		add(lblCola);

		lblPilaUno = new JLabel("PilaUno");
		lblPilaUno.setForeground(new Color(0, 0, 102));
		lblPilaUno.setFont(new Font("Give You Glory", Font.BOLD | Font.ITALIC, 16));
		lblPilaUno.setBounds(49, 113, 67, 25);
		add(lblPilaUno);

		lblPilaDos = new JLabel("PilaDos");
		lblPilaDos.setForeground(new Color(0, 0, 102));
		lblPilaDos.setFont(new Font("Give You Glory", Font.BOLD | Font.ITALIC, 16));
		lblPilaDos.setBounds(49, 149, 67, 25);
		add(lblPilaDos);

		lblLista = new JLabel("Lista");
		lblLista.setForeground(new Color(0, 0, 102));
		lblLista.setFont(new Font("Give You Glory", Font.BOLD | Font.ITALIC, 16));
		lblLista.setBounds(119, 274, 54, 25);
		add(lblLista);

		textField = new JTextField();
		textField.setFont(new Font("Give You Glory", Font.BOLD | Font.ITALIC, 16));
		textField.setBounds(103, 398, 171, 25);
		add(textField);
		textField.setColumns(10);

		lblIconoMonedas = new JLabel("");
		lblIconoMonedas.setBounds(27, 377, 67, 63);

		ImageIcon imgIcon = new ImageIcon("img/iconoMonedas.png");
		Image imgEscalada = imgIcon.getImage().getScaledInstance(lblIconoMonedas.getWidth(),
				lblIconoMonedas.getHeight(), Image.SCALE_SMOOTH);
		Icon iconoEscalado = new ImageIcon(imgEscalada);
		lblIconoMonedas.setIcon(iconoEscalado);
		add(lblIconoMonedas);

		txtMensaje = new JTextField();
		txtMensaje.setBounds(376, 400, 334, 40);
		add(txtMensaje);
		txtMensaje.setColumns(10);

	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTxtMensaje() {
		return txtMensaje;
	}

	public void setTxtMensaje(JTextField txtMensaje) {
		this.txtMensaje = txtMensaje;
	}

	public JPanel getCola() {
		return cola;
	}

	public void setCola(JPanel cola) {
		this.cola = cola;
	}

	public JPanel getPilaUno() {
		return pilaUno;
	}

	public void setPilaUno(JPanel pilaUno) {
		this.pilaUno = pilaUno;
	}

	public JPanel getPilaDos() {
		return pilaDos;
	}

	public void setPilaDos(JPanel pilaDos) {
		this.pilaDos = pilaDos;
	}

	public JPanel getLista() {
		return lista;
	}

	public void setLista(JPanel lista) {
		this.lista = lista;
	}

	public JLabel getLblCola() {
		return lblCola;
	}

	public void setLblCola(JLabel lblCola) {
		this.lblCola = lblCola;
	}

	public JLabel getLblPilaUno() {
		return lblPilaUno;
	}

	public void setLblPilaUno(JLabel lblPilaUno) {
		this.lblPilaUno = lblPilaUno;
	}

	public JLabel getLblPilaDos() {
		return lblPilaDos;
	}

	public void setLblPilaDos(JLabel lblPilaDos) {
		this.lblPilaDos = lblPilaDos;
	}

	public JLabel getLblLista() {
		return lblLista;
	}

	public void setLblLista(JLabel lblLista) {
		this.lblLista = lblLista;
	}

	public JLabel getLblIconoMonedas() {
		return lblIconoMonedas;
	}

	public void setLblIconoMonedas(JLabel lblIconoMonedas) {
		this.lblIconoMonedas = lblIconoMonedas;
	}
	
	
}
