import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

//SOY PICHA16
public class Dibujar extends JFrame{
	
	Canvas canvas;
	Graphics g;
	
	public Dibujar(){
		
		canvas=new Canvas();
		//clase1 obj=new clase1();
		//canvas.addMouseListener(obj);
		canvas.addMouseListener(
				new MouseAdapter(){
					public void mouseClicked(MouseEvent arg0){
						System.out.println("Click!");
						canvas.repaint();
					}
					public void mouseEntered(MouseEvent arg0){
						g=canvas.getGraphics();
						g.setColor(Color.CYAN);
						g.fillRect(20, 20, 10, 10);
						System.out.println("Dentro del canvas!");
					}
					public void mouseExited(MouseEvent arg0){
						System.out.println("Fuera del canvas!");
					}
				});
				
		this.add(canvas,BorderLayout.CENTER);
		this.setSize(200,200);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Dibujar();
		
	}
	
	/*public class clase1 extends MouseAdapter{
		public void mouseClicked(MouseEvent arg0){
			System.out.println("Evento 02 realizado");
		}
	}*/

	

}
