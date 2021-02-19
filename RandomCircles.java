package week2;

import acm.program.*;
import acm.graphics.*;
import acm.util.*; 

public class RandomCircles extends GraphicsProgram {
	 private static final int TOTALCIRCLES = 10; 
	 private static final double MIN_RADIUS = 5; 
	 private static final double MAX_RADIUS = 50; 
	 public void run() {
		 for (int i = 0; i < TOTALCIRCLES; i++) {
		 double a = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
		 double b = rgen.nextDouble(0, getWidth() - 2 * a);
		 double c = rgen.nextDouble(0, getHeight() - 2 *a);
		 GOval circle = new GOval(b, c, 2 * a, 2 * a);
		 circle.setFilled(true);
		 circle.setColor(rgen.nextColor());
		 add(circle); 
		 }
	 }
	 private RandomGenerator rgen = RandomGenerator.getInstance(); 
}