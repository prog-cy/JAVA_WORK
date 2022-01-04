package gui;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame extends JFrame{
	
	@SuppressWarnings("static-access")
	MyFrame(){
		
		this.setTitle("GUI2");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(800, 700);
		this.setVisible(true);
		
		ImageIcon image = new ImageIcon("Vanamo_Logo.png");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(0, 222, 20));
	}

}
