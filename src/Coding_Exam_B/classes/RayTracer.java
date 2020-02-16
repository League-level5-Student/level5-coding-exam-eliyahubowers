package Coding_Exam_B.classes;

import java.awt.Color;

public class RayTracer {
	public static Color backgroundColor = new Color(0);	
	public RayTracer(int width, int height, Camera camera) {
		
		Color[][] pixels = new Color[width][height];
		int hWidth = width / 2;
		int hHeight = height / 2;
		
		for (int i = 0; i < pixels.length; i++) {
			for (int j = 0; j < pixels[i].length; j++) {
				float frameX = i;
				float frameY = j;

				Vector3 framePixelPosition = new Vector3(camera.position);
				framePixelPosition.add(camera.right.multiply(-hWidth).add(frameX));
				framePixelPosition.add(camera.up.multiply(-hHeight).add(frameY));
				framePixelPosition.add(camera.forward.multiply(camera.frameDistance));
				Vector3 vecDir = Vector3.subtract(framePixelPosition, camera.position).normalize();
				//TODO: Make a Ray class
			}
		}
		//TODO: Display the final image
	}
	
	public static void main(String[] args) {
		//TODO: Create a Scene
	}
}
