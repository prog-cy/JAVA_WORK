package gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class SimpleGUI {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame(); //creates a frame
		frame.setTitle("My First GUI"); //change the title of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close the frame
		frame.setSize(800, 700); //set the size of the frame x-dimension and y-dimension
		frame.setResizable(true);
		frame.setVisible(true); // make frame visible
		
		ImageIcon image = new ImageIcon("second.png"); //create an image icon
		frame.setIconImage(image.getImage());// change the icon of the frame
		frame.getContentPane().setBackground(new Color(0xFF00FF)); //change the background color of the frame
		//frame.getContentPane().setBackground(Color.cyan); //This is another way to change the background color of the frame
		//frame.getContentPane().setBackground(new Color(0, 0, 0)); //This is one more way to change the background color of the frame.
		
	}

}
