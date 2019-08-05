package Kohli;

import java.util.*;

public class RemainingMatch {

	// Scanner scanner = new Scanner(System.in);
	Node totalBalls = new Node();
	int index = 0;
	List<String> result = new ArrayList();

	void root() {
		totalBalls.balls = 10;
		totalBalls.name = "Pakistan";
		totalBalls.children = null;
	}

	void bowlers(String[] names, int[] balls) {
		for (int index = 0; index < 3; index++) {
			Node node = new Node();
			node.name = names[index];
			node.balls = balls[index];
			node.children = null;
			System.out.println(node);
			System.out.println(node.balls);
			//System.out.println(totalBalls.children.get(0));
			try
			{
				totalBalls.children.add(node);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

	void bowlerSequence() {
		String bowler = "";
		int temp = 0;
		for (int index = 1; index < totalBalls.children.size(); index++) {
			// Node node = totalBalls.children.get(index);
		if (totalBalls.children.get(index - 1).balls > totalBalls.children
					.get(index).balls) {

				bowler = totalBalls.children.get(index - 1).name;
				temp = 	totalBalls.children.get(index - 1).balls;
			} else {
				temp = totalBalls.children.get(index).balls;
				bowler = totalBalls.children.get(index - 1).name;
			}
		}
		System.out.println(temp + bowler);
	}
}
