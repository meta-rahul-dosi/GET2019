package Kohli;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainClass main = new MainClass();
		RemainingMatch match = new RemainingMatch();

		match.root();
		
		String[] names = { "b1", "b2", "b3" };
		int[] balls = { 5, 2, 3 };
		match.bowlers(names, balls);
		
		match.bowlerSequence();
	}

}
