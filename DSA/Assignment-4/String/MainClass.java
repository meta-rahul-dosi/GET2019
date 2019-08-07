package String;

public class MainClass {

	public static void main(String[] args) {

		MainClass main = new MainClass();
		StringOperations object = new StringOperations();

		String expression = "expresiion";
		System.out.println("string is \n "+ expression);

		System.out.println("number of unique characters in string is "
				+ object.findTotalUniqueCharacters(expression));

	}

}
