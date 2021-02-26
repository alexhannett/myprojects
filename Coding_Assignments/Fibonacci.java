package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	public void run() {
println("This program lists the Fibonacci sequence.");
	int fib1 = 0;
	int fib2 = 1;
		while (fib1 <= MAX_TERM_VALUE) {
			println(fib1);
			int fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
		}
	}
private static final int MAX_TERM_VALUE = 10000;
}