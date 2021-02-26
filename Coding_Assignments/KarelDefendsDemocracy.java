package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		for (int i = 0; i < 5; i++) {
			if (beepersPresent()) {
				move();				
			} else {
				move();
			}
		
		}
		
		turnLeft();
		move();
		pickBeeper();
		turnRight();
		turnRight();
		move();
		turnLeft();		
		move();
		move();
		move();
		move();
		turnLeft();
		move();
		pickBeeper();
		turnRight();
		turnRight();
		move();
		move();
		pickBeeper();
		pickBeeper();
		turnLeft();
		turnLeft();
		move();
		turnRight();
		move();
		
		
	}
	
		
}
