
public class PrimeNumber {

	/**
	 * 
	 * @param args
	 * 
	 */

	public enum State {
		init, prime, checky
	};

	/*
	 * 
	 * private void printAnswer(double m, double x, double y) {
	 * 
	 * 
	 * }
	 * 
	 */

 

	private static void prime_print(double m) {
 		System.out.print(m + " is a prime");
 	}

	private static void factorPrint(double m)

	{
 		int addOne = (int) m + 1;
 		int squareRoot = (int) Math.floor(Math.sqrt(addOne));
 		int factorOne = squareRoot - 1;
 		int factorTwo = squareRoot + 1;
 		System.out.println((int) m + " = " + addOne + " -" + " 1 " +

				"= " + squareRoot + "^2" + " - 1^2" + "= " +

				"(" + squareRoot + " - 1)" + "(" + squareRoot + " + 1)" + " = " + factorOne + "*" + factorTwo);
 	}

	public static void main(String[] args) {

		boolean done = false;

		double x = 0, y = 0, m = 15;

		State state = State.init;

		while (!done) {

			switch (state) {

			// initialize x to the floor of the square root of m

			case init:

				x = Math.floor(Math.sqrt(m));

				y = 0;

				if (Math.pow(x, 2) == m) {

					System.out.println("init");

					factorPrint(m);

					done = true;

				}

				else { // increment x and go to state 2

					x = x + 1;

					state = State.prime;

				}

				break;

			case prime:

				if (x == ((m + 1) / 2)) {

					prime_print(m);

					done = true;

				}

				else {

					y = Math.sqrt(Math.pow(x, 2) - m);

					state = State.checky;

				}

				break;

			case checky:

				if ((Math.pow(Math.floor(y), 2)) == (Math.pow(x, 2) - m)) {

					factorPrint(m);

					done = true;

				}

				else {

					x = x + 1;

					state = State.prime;

				}

				break;

			}

		}

	}

}