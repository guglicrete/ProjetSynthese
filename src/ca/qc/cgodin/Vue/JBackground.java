package ca.qc.cgodin.Vue;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class JBackground extends JDesktopPane {
	private Image img;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public JBackground() {
		this.img = (new ImageIcon("resources\\BGGLogo.png")).getImage();

	}

	protected void paintComponent(Graphics g){
		
		Graphics2D g2d = (Graphics2D)g;
		g.drawImage(img, 0, 0, (ImageObserver)this);
		double x = img.getWidth(null);
		double y = img.getHeight(null);
		g2d.scale(getWidth()/x, getHeight()/y);
		g2d.drawImage(img, 0, 0, this);
		
	}

	
	
}
