package uniandes.dpoo.triqui.interfaz;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelBotones extends JPanel implements ActionListener
{
	private JLabel espacio = new JLabel("0 jugadas");
	private JButton reiniciar = new JButton("Reiniciar");
	private VentanaTriqui VentanaTriqui;
	
	public PanelBotones(VentanaTriqui padre)
	{
		JPanel panel = new JPanel();
		add(reiniciar, FlowLayout.LEFT);
		add(espacio, FlowLayout.CENTER);
		reiniciar.addActionListener(this);
		VentanaTriqui = padre;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object fuente = e.getSource();
		if (fuente == reiniciar)
			VentanaTriqui.reiniciar();
	}

	public void actualizarCantidadJugadas(int numero)
	{
		String numeroconvertido = numero +"";
		espacio.setText(numeroconvertido + " jugadas");
	}
}
