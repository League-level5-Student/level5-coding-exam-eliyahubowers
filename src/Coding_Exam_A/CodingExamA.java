package Coding_Exam_A;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CodingExamA {
	public static void main(String[] args) {
		/*
		 * Write a program that asks the user for three pieces of information.
		 * 1. How many robots
		 * 2. The color of the shapes
		 * 3. How many sides each shape will have
		 * 
		 * Once the information has been collected, the program will then make the requested number of robots
		 * each draw the requested shape in the requested color. The robots should execute at the same time so 
		 * Threads will need to be used. Arrange the robots so that the shapes do not overlap.
		 * For full credit, define the Thread functions using lambdas.
		 * 
		 * See the Coding_Exam_A_Demo.jar for an example of what the finished product should look like.
		 */
		
		String s = JOptionPane.showInputDialog("How many Robots");
		
		Robot[] r = new Robot[Integer.parseInt(s)];
		
		int increment = 0;
		
		for(int i = 0 ; i < r.length; i++) {
			r[i] = new Robot();
			r[i].penDown();
			r[i].setX(((i*200)-(increment*12*200))+100);
			r[i].setY((increment*200)+100);
			if((i+1)%12 == 0) {
				increment++;
			}
			r[i].setSpeed(1000);
		}
		
		s = JOptionPane.showInputDialog("What Color: ( red , green , blue)");
		
		switch (s) {
		case "red":
			for(int i = 0 ; i < r.length; i++) {
				r[i].setPenColor(Color.red);
			}
			break;
		case "green":
			for(int i = 0 ; i < r.length; i++) {
				r[i].setPenColor(Color.green);
			}
			break;
		case "blue":
			for(int i = 0 ; i < r.length; i++) {
				r[i].setPenColor(Color.blue);
			}
			break;
		}
		
		s = JOptionPane.showInputDialog("How many sides to a shape? ( >0 )");
		
		int sides = Integer.parseInt(s);
		int angle = 360/sides;
		
		Thread[] t = new Thread[r.length];
		
		for(int i = 0; i < r.length; i++) {
			int l = i;
			t[i] = new Thread(() -> {
				for(int j = 0; j < sides; j++) {
					r[l].move(100);				
					r[l].turn(angle);
				}
			});
		}
		
		System.out.println("now");
		
		for(int i = 0; i < t.length; i++) {
			t[i].start();
		}
		
	}
}
