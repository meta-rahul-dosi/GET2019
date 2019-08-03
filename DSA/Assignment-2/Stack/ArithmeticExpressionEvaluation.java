package Stack;

import java.text.DecimalFormat;

public class ArithmeticExpressionEvaluation {
	private static DecimalFormat df = new DecimalFormat("0.00");

	/**
	 * method to evaluate expression. Check the expression right or not. It
	 * perform evaluation on arithmetic expression. It take only arithmetic
	 * value and operator.
	 * 
	 * @param expression
	 * @return
	 */
	public String evaluateExpression(String expression) {
		if (checkExpression(expression)) {
			return "Invalid expression";
		} else {
			StackOperations stack = new StackOperations();
			String postFixExpression = convertInfixToPostFix(expression), value1, value2, solution;
			String[] tokens = postFixExpression.split("\\s");

			for (String token : tokens) {
				if (token.equals("==") || token.equals("!=")
						|| token.equals("<=") || token.equals("<")
						|| token.equals(">=") || token.equals(">")
						|| token.equals("+") || token.equals("-")
						|| token.equals("*") || token.equals("/")) {
					value1 = stack.pop();
					value2 = stack.pop();

					solution = getSolution(value1, value2, token);
					stack.push(solution);

				} else {
					stack.push(token);
				}
			}
			return stack.pop();
		}
	}

	/**
	 * Method to convert the infix expression to postfix expression.
	 * 
	 * @param expression
	 * @return postfic of the infix expression.
	 */
	private String convertInfixToPostFix(String expression) {
		String postFixExpression = "";
		StackOperations stack = new StackOperations();
		String[] tokens = expression.split("\\s");
		int precedence;

		for (String token : tokens) {
			if (token.equals("==") || token.equals("!=") || token.equals("<=")
					|| token.equals("<") || token.equals(">=")
					|| token.equals(">") || token.equals("+")
					|| token.equals("-") || token.equals("*")
					|| token.equals("/") || token.equals("(")
					|| token.equals(")")) {
				precedence = precedenceCheck(token);
				if (token.equals(")")) {
					while (stack.top.data.equals("(") == false) {
						postFixExpression += stack.pop() + " ";
					}

					stack.pop();
				} else if (stack.top == null
						|| precedence > precedenceCheck(stack.top.data)) {
					stack.push(token);
				} else {
					while (stack.top != null
							&& precedence <= precedenceCheck(stack.top.data)
							&& !stack.top.data.equals("(")) {
						postFixExpression += stack.pop() + " ";
					}

					stack.push(token);
				}
			} else {
				postFixExpression += token + " ";
			}
		}

		while (stack.top != null) {
			postFixExpression += stack.pop() + " ";
		}

		return postFixExpression;
	}

	/**
	 * Return the precedence of operator as per design.
	 * 
	 * @param operator
	 * @return precedence of operator
	 */
	private int precedenceCheck(String operator) {
		switch (operator) {
		case "==":
		case "!=":
			return 1;

		case "<":
		case "<=":
		case ">":
		case ">=":
			return 2;

		case "+":
		case "-":
			return 3;

		case "*":
		case "/":
			return 4;

		case "(":
		case ")":
			return 5;
		}

		return -1;
	}

	/**
	 * Method perform arithmetic and boolean operation.
	 * 
	 * @param value01
	 * @param value02
	 * @param token
	 *            operator
	 * @return
	 */
	private String getSolution(String value01, String value02, String token) {
		double value1 = Double.parseDouble(value01);
		double value2 = Double.parseDouble(value02);

		switch (token) {
		case "+": {
			return df.format(value1 + value2);
		}
		case "-": {
			return df.format(value2 - value1);
		}
		case "*": {
			return df.format(value1 * value2);
		}
		case "/": {
			try {
				return df.format(value2 / value1);
			} catch (ArithmeticException e) {
				System.out.println("Divided by zero" + e);
			}
		}
		case "==": {
			boolean result = (value1 == value2);
			return String.valueOf(result);
		}
		case "!=": {
			boolean result = (value1 != value2);
			return String.valueOf(result);
		}
		case "<": {
			boolean result = (value2 < value1);
			return String.valueOf(result);
		}
		case ">": {
			boolean result = (value2 > value1);
			return String.valueOf(result);
		}
		case "<=": {
			boolean result = (value2 <= value1);
			return String.valueOf(result);
		}
		case ">=": {
			boolean result = (value2 >= value1);
			return String.valueOf(result);
		}
		default:
			break;
		}

		return " ";
	}

	/**
	 * Method check the expression is right or not.
	 * 
	 * @param expression
	 * @return true if expression is wrong else false.
	 */
	private boolean checkExpression(String expression) {
		expression = expression.trim();
		int length = expression.length();
		boolean flag = false;
		char firstChar = expression.charAt(0);
		char lastChar = expression.charAt(length - 1);

		// if first char is operator.
		if (firstChar == 33 || (firstChar >= 41 && firstChar <= 43)
				|| firstChar == 45 || firstChar == 47
				|| (firstChar >= 60 && firstChar <= 62)) {
			return true;
		}
		// If last char is operator.
		else if (lastChar == 33 || lastChar == 40
				|| (lastChar >= 42 && lastChar <= 43) || lastChar == 45
				|| lastChar == 47 || (lastChar >= 60 && lastChar <= 62)) {
			return true;
		}

		int ascii = 0, previousAscii;
		for (int index = 0; index < length; index++) {
			if (expression.charAt(index) == ' ') {
				continue;
			}

			previousAscii = ascii;
			ascii = (int) (expression.charAt(index));

			if (ascii == 32 || ascii == 33 || (ascii >= 40 && ascii <= 43)
					|| ascii == 45 || (ascii >= 47 && ascii <= 57)
					|| (ascii >= 60 && ascii <= 62)) {
				flag = false;
			} else {
				return true;
			}
		}

		return flag;
	}
}