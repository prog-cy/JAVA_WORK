package gui;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI3 {

	public static void main(String[] args) {
		
		
		ImageIcon image = new ImageIcon("second.png");
		
		Border border = BorderFactory.createLineBorder(Color.green, 4);
		
		JLabel label = new JLabel();
		label.setText("This is Graphical User Interface");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0, 102, 224));
		label.setFont(new Font("Boli", Font.HANGING_BASELINE, 20));
		label.setIconTextGap(40);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    frame.add(label);

	}

}
