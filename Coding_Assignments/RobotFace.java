package week2;

import acm.program.*;
import acm.graphics.*;
import java.awt.Color;

public class RobotFace extends GraphicsProgram {

	private static final int HEAD_WIDTH = 150;
	private static final int HEAD_HEIGHT = 250;
	private static final int EYE_RADIUS = 15;
	private static final int MOUTH_WIDTH = 75;
	private static final int MOUTH_HEIGHT = 25;

	public void run() {
		double rf = getWidth()/2;
		double hr = getHeight()/2;
		createHead(rf - HEAD_WIDTH/2, hr - HEAD_HEIGHT/2);
		createEye(rf - HEAD_WIDTH/4, hr - HEAD_HEIGHT/4);
		createEye(rf + HEAD_WIDTH/4, hr - HEAD_HEIGHT/4);
		createMouth(rf - MOUTH_WIDTH/2, hr + HEAD_HEIGHT/4);
	}
	
	private void drawRectangle(double x, double y, double width, double height, Color c){
		GRect rect = new GRect(x, y, width, height);
		rect.setFilled(true);
		rect.setColor(c);
		add(rect);
	}
	
	private void drawCircle(double rf, double hr, double r, Color c){
		double x = rf - r;
		double y = hr - r;
		GOval circle = new GOval(2*r, 2*r);
		circle.setFilled(true);
		circle.setColor(c);
		add(circle, x, y);
	}

	private void createHead(double x, double y){
		drawRectangle(x, y, HEAD_WIDTH, HEAD_HEIGHT, Color.GRAY);
	}
	
	private void createEye(double rf, double hr){
		drawCircle(rf, hr, EYE_RADIUS, Color.YELLOW);
	}
	
	private void createMouth(double x, double y){
		drawRectangle(x,y, MOUTH_WIDTH, MOUTH_HEIGHT, Color.WHITE);
	} 
	
}