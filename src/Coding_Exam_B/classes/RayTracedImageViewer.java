package Coding_Exam_B.classes;

import java.awt.Color;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RayTracedImageViewer {
	public RayTracedImageViewer(Color[][] pixels) {
		
		BufferedImage image = new BufferedImage(pixels.length, pixels[0].length, BufferedImage.TYPE_INT_ARGB);
		
		for(int i = 0; i < pixels.length; i++){
			for(int j = 0; j < pixels[i].length; j++) {
				image.setRGB(i, j, pixels[i][j].getRGB());
			}
		}	
		
		JLabel imgLab = new JLabel();
		imgLab.setIcon(new ImageIcon(image));
		JFrame window = new JFrame();
		window.add(imgLab);
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);		
		//TODO: Needs testing
	}
}
