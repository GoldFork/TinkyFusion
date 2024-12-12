package mainPackage;

import javax.swing.*;
import java.awt.*;

public class Tinky {
	private JFrame tinkyFrame;
	private JLabel tinkyLabel;
	private ImageIcon tinkyIcon,newTinkyIcon;
	private int width,widthFrame,height,heightFrame;
	
	Tinky(){
		tinkyFrame = new JFrame("Tinky - \"HAAA!\"");
		tinkyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tinkyFrame.setResizable(false);
		tinkyFrame.getContentPane().setBackground(Color.WHITE);
		java.net.URL raccoon = Main .class.getResource("/mainPackage/resources/raccoonIcon.png");
		tinkyFrame.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(raccoon));
		
		tinkyLabel = new JLabel();
		tinkyLabel.setBounds(0,0,500,500);
		java.net.URL tomImg = Main.class.getResource("/mainPackage/resources/Tinky.png");
		tinkyIcon = new ImageIcon(tomImg);
		Image newTomImg = tinkyIcon.getImage().getScaledInstance(500, 500, Image.SCALE_AREA_AVERAGING);
		newTinkyIcon = new ImageIcon(newTomImg);
		tinkyLabel.setIcon(newTinkyIcon);
		tinkyLabel.setHorizontalAlignment(JLabel.LEFT);
		tinkyLabel.setVerticalAlignment(JLabel.CENTER);
		
		tinkyFrame.add(tinkyLabel);
		tinkyFrame.pack();
		
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		width = (int) size.getWidth();
		height = (int) size.getHeight();
		widthFrame = (width/2)-(tinkyFrame.getWidth()/2);
		heightFrame = (height/2)-(tinkyFrame.getHeight()/2);
		tinkyFrame.setLocation(widthFrame,heightFrame);
		
		tinkyFrame.setVisible(true);
	}
}
