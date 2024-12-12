package mainPackage;

import javax.swing.*;
import javax.sound.sampled.*;
import java.awt.*;

public class Tom {
	private JFrame tomFrame,inkyFrame;
	private JLabel tomLabel,inkyLabel;
	private ImageIcon tomIcon,newTomIcon,inkyIcon,newInkyIcon;
	private int widthTom,widthFrameTom,heightTom,heightFrameTom,widthInky,widthFrameInky,heightInky,heightFrameInky;
	private String anticipationString;
	
	class Player{
		void playMusic(String song) {
			try {
				java.net.URL songURL = Main.class.getResource("/mainPackage/resources/presenting.wav");
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(songURL);
				Clip musicClip = AudioSystem.getClip();
				musicClip.open(audioInput);
				musicClip.start();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	Tom(){
		//Tom
		tomFrame = new JFrame("Tom - \"Fu...\"");
		tomFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tomFrame.setResizable(false);
		tomFrame.getContentPane().setBackground(Color.WHITE);
		java.net.URL raccoon = Main .class.getResource("/mainPackage/resources/raccoonIcon.png");
		tomFrame.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(raccoon));
		
		tomLabel = new JLabel();
		tomLabel.setBounds(0,0,500,500);
		java.net.URL tomImg = Main.class.getResource("/mainPackage/resources/Tom.png");
		tomIcon = new ImageIcon(tomImg);
		Image newTomImg = tomIcon.getImage().getScaledInstance(500, 500, Image.SCALE_AREA_AVERAGING);
		newTomIcon = new ImageIcon(newTomImg);
		tomLabel.setIcon(newTomIcon);
		tomLabel.setHorizontalAlignment(JLabel.LEFT);
		tomLabel.setVerticalAlignment(JLabel.CENTER);
		
		tomFrame.add(tomLabel);
		tomFrame.pack();
		
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		widthTom = (int) size.getWidth();
		heightTom = (int) size.getHeight();
		widthFrameTom = (widthTom/2)-tomFrame.getWidth();
		heightFrameTom = (heightTom/2)-(tomFrame.getHeight()/2);
		tomFrame.setLocation(widthFrameTom-892,heightFrameTom);
		
		tomFrame.setVisible(true);
		
		//Softie
		inkyFrame = new JFrame("Inky - \"...sion -\"");
		inkyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inkyFrame.setResizable(false);
		inkyFrame.getContentPane().setBackground(Color.WHITE);
		inkyFrame.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(raccoon));
		
		inkyLabel = new JLabel();
		inkyLabel.setBounds(0,0,500,500);
		java.net.URL inkyImg = Main.class.getResource("/mainPackage/resources/Softie.png");
		inkyIcon = new ImageIcon(inkyImg);
		Image newInkyImg = inkyIcon.getImage().getScaledInstance(500, 500, Image.SCALE_AREA_AVERAGING);
		newInkyIcon = new ImageIcon(newInkyImg);
		inkyLabel.setIcon(newInkyIcon);
		inkyLabel.setHorizontalAlignment(JLabel.LEFT);
		inkyLabel.setVerticalAlignment(JLabel.CENTER);
		
		inkyFrame.add(inkyLabel);
		inkyFrame.pack();
		
		//Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		widthInky = (int) size.getWidth();
		heightInky = (int) size.getHeight();
		widthFrameInky = widthInky/2;
		heightFrameInky = (heightInky/2)-(inkyFrame.getHeight()/2);
		inkyFrame.setLocation(widthFrameInky+892,heightFrameInky);
		
		//Player
		anticipationString = "src/resources/clownLoop.wav";
		Player play = new Player();
		play.playMusic(anticipationString);
		
		inkyFrame.setVisible(true);
		
		widthFrameTom = widthFrameTom - 892;
		widthFrameInky = widthFrameInky + 892;
		
		for(int x = 0; x < 900; x++) {
			
			widthFrameTom = widthFrameTom + 1;
			tomFrame.setLocation(widthFrameTom,heightFrameTom);
			
			widthFrameInky = widthFrameInky - 1;
			inkyFrame.setLocation(widthFrameInky,heightFrameInky);
			//200 = 6000
			try {
				Thread.sleep(29);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		tomFrame.dispose();
		inkyFrame.dispose();
		Tinky tinky = new Tinky();
	}
}