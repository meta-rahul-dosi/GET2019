package String;

public class MainClass {

	public static void main(String[] args) {

		MainClass main = new MainClass();
		StringOperations object = new StringOperations();

		System.out.println("string is ");
		String expression = main.inputString();
		System.out.println(expression);
		
		System.out.println("number of unique characters in string is "
				+ object.findTotalUniqueCharacters(expression));

	}

	String inputString() {
		// return scanner.nextLine();
		return "expression";
	}

}
