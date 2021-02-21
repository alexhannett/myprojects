package week2;

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class DrawingLines extends GraphicsProgram {
	public void run() {
		readInstructions();
		addMouseListeners();
	}
	
	private void readInstructions() {
		GLabel instructions = new GLabel("Click, drag and release your mouse to draw a line.", 16, 25);
		add (instructions);
	}
	
 public void mousePressed(MouseEvent a) {
 double x = a.getX();
 double y = a.getY();
 line = new GLine(x, y, x, y);
 add(line);
 
 }
 
 public void mouseDragged(MouseEvent a) {
 double x = a.getX();
 double y = a.getY();
 line.setEndPoint(x, y);
 
 }
 
	private GLine line;

}