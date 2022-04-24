package uniandes.dpoo.triqui.interfaz;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

import uniandes.dpoo.triqui.mundo.Triqui;

@SuppressWarnings("serial")
public class PanelTriqui extends JPanel implements MouseListener
{
	private VentanaTriqui Ventana;
	private int count;
	private int posicion;
	public PanelTriqui(VentanaTriqui ventanaTriqui)
	{
		JPanel panel = new JPanel();
		addMouseListener(this);
		Ventana = ventanaTriqui;
		
	}

	public void actualizarTablero(Triqui triqui)
	{
		repaint();
	}

	@Override
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;

		pintarLineas(g2d);
		pintarJugadas(g2d);
	}

	private void pintarJugadas(Graphics2D g2d)
	{
		int width = this.getWidth();
		int height = this.getHeight();
		if (posicion == 1) {
			if ((count%2) != 0) {
				g2d.drawLine((int)(width*0.25), (int)(height*0.15), (int)(width*0.35),(int)(height*0.30));
				g2d.drawLine((int)(width*0.25), (int)(height*0.30),(int)(width*0.35), (int)(height*0.15));
			}
			 else {
				g2d.drawOval((int)(width*0.25), (int)(height*0.15), (int)(width*0.35)-(int)(width*0.25), (int)(height*0.30)-(int)(height*0.15));
			}
		}
		if (posicion == 2) {
			if ((count%2) != 0) {
				g2d.drawLine((int)(width*0.45), (int)(height*0.15), (int)(width*0.55),(int)(height*0.30));
				g2d.drawLine((int)(width*0.45), (int)(height*0.30),(int)(width*0.55), (int)(height*0.15));
			}
			 else {
				g2d.drawOval((int)(width*0.45), (int)(height*0.15), (int)(width*0.55)-(int)(width*0.45), (int)(height*0.30)-(int)(height*0.15));
			}
		}
		if (posicion == 3) {
			if ((count%2) != 0) {
				g2d.drawLine((int)(width*0.65), (int)(height*0.15), (int)(width*0.75),(int)(height*0.30));
				g2d.drawLine((int)(width*0.65), (int)(height*0.30),(int)(width*0.75), (int)(height*0.15));
			}
			 else {
				g2d.drawOval((int)(width*0.65), (int)(height*0.15), (int)(width*0.75)-(int)(width*0.65), (int)(height*0.30)-(int)(height*0.15));
			}
		}
		if (posicion == 4) {
			if ((count%2) != 0) {
				g2d.drawLine((int)(width*0.25), (int)(height*0.42), (int)(width*0.35),(int)(height*0.57));
				g2d.drawLine((int)(width*0.25), (int)(height*0.57),(int)(width*0.35), (int)(height*0.42));
			}
			 else {
				g2d.drawOval((int)(width*0.25), (int)(height*0.42), (int)(width*0.35)-(int)(width*0.25), (int)(height*0.30)-(int)(height*0.15));
			}
		}
		if (posicion == 5) {
			if ((count%2) != 0) {
				g2d.drawLine((int)(width*0.45), (int)(height*0.42), (int)(width*0.55),(int)(height*0.57));
				g2d.drawLine((int)(width*0.45), (int)(height*0.57),(int)(width*0.55), (int)(height*0.42));
			}
			 else {
				g2d.drawOval((int)(width*0.45), (int)(height*0.42), (int)(width*0.55)-(int)(width*0.45), (int)(height*0.30)-(int)(height*0.15));
			}
		}
		if (posicion == 6) {
			if ((count%2) != 0) {
				g2d.drawLine((int)(width*0.65), (int)(height*0.42), (int)(width*0.75),(int)(height*0.57));
				g2d.drawLine((int)(width*0.65), (int)(height*0.57),(int)(width*0.75), (int)(height*0.42));
			}
			 else {
				g2d.drawOval((int)(width*0.65), (int)(height*0.42), (int)(width*0.75)-(int)(width*0.65), (int)(height*0.30)-(int)(height*0.15));
			}
		}
		if (posicion == 7) {
			if ((count%2) != 0) {
				g2d.drawLine((int)(width*0.25), (int)(height*0.69), (int)(width*0.35),(int)(height*0.84));
				g2d.drawLine((int)(width*0.25), (int)(height*0.84),(int)(width*0.35), (int)(height*0.69));
			}
			 else {
				g2d.drawOval((int)(width*0.25), (int)(height*0.69), (int)(width*0.35)-(int)(width*0.25), (int)(height*0.30)-(int)(height*0.15));
			}
		}
		if (posicion == 8) {
			if ((count%2) != 0) {
				g2d.drawLine((int)(width*0.45), (int)(height*0.69), (int)(width*0.55),(int)(height*0.84));
				g2d.drawLine((int)(width*0.45), (int)(height*0.84),(int)(width*0.55), (int)(height*0.69));
			}
			 else {
				g2d.drawOval((int)(width*0.45), (int)(height*0.69), (int)(width*0.55)-(int)(width*0.45), (int)(height*0.30)-(int)(height*0.15));
			}
		}
		if (posicion == 9) {
			if ((count%2) != 0) {
				g2d.drawLine((int)(width*0.65), (int)(height*0.69), (int)(width*0.75),(int)(height*0.84));
				g2d.drawLine((int)(width*0.65), (int)(height*0.84),(int)(width*0.75), (int)(height*0.69));
			}
			 else {
				g2d.drawOval((int)(width*0.65), (int)(height*0.69), (int)(width*0.75)-(int)(width*0.65), (int)(height*0.30)-(int)(height*0.15));
			}
		}
	}

	private void pintarLineas(Graphics2D g2d)
	{
		int width = this.getWidth();
		int height = this.getHeight();
		int xIzq = (int) (width*0.4);
		int yIzq = (int) (height*0.1);
		g2d.drawLine(xIzq,yIzq,xIzq,height-yIzq);
		g2d.drawLine(width-xIzq,yIzq,width-xIzq,height-yIzq);
		g2d.drawLine((int)(width*0.2),(int)(height*0.37),width-(int)(width*0.2),(int)(height*0.37));
		g2d.drawLine((int)(width*0.2),(int)(height*0.64),width-(int)(width*0.2),(int)(height*0.64));
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		int width = this.getWidth();
		int height = this.getHeight();
		int xpos = e.getX();
		int ypos = e.getY();
		if (xpos<(width*0.4) && xpos>(width*0.2) && ypos<(height*0.37) && ypos>(height*0.1)) {
			Ventana.jugar(0, 0);
			posicion = 1;
			count++;
		}
		if (xpos<(width*0.6) && xpos>(width*0.4) && ypos<(height*0.37) && ypos>(height*0.1)) {
			Ventana.jugar(0, 1);
			posicion = 2;
			count++;
		}
		if (xpos<(width*0.8) && xpos>(width*0.6) && ypos<(height*0.37) && ypos>(height*0.1)) {
			Ventana.jugar(0, 2);
			posicion = 3;
			count++;
		}
		if (xpos<(width*0.4) && xpos>(width*0.2) && ypos<(height*0.64) && ypos>(height*0.37)) {
			Ventana.jugar(1, 0);
			posicion = 4;
			count++;
		}
		if (xpos<(width*0.6) && xpos>(width*0.4) && ypos<(height*0.64) && ypos>(height*0.37)) {
			Ventana.jugar(1, 1);
			posicion = 5;
			count++;
		}
		if (xpos<(width*0.8) && xpos>(width*0.6) && ypos<(height*0.64) && ypos>(height*0.37)) {
			Ventana.jugar(1, 2);
			posicion = 6;
			count++;
		}
		if (xpos<(width*0.4) && xpos>(width*0.2) && ypos<(height*0.90) && ypos>(height*0.64)) {
			Ventana.jugar(2, 0);
			posicion = 7;
			count++;
		}
		if (xpos<(width*0.6) && xpos>(width*0.4) && ypos<(height*0.90) && ypos>(height*0.64)) {
			Ventana.jugar(2, 1);
			posicion = 8;
			count++;
		}
		if (xpos<(width*0.8) && xpos>(width*0.6) && ypos<(height*0.90) && ypos>(height*0.64)) {
			Ventana.jugar(2, 2);
			posicion = 9;
			count++;
		}
	}

	@Override
	public void mousePressed(MouseEvent e)
	{

	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
	}

}
