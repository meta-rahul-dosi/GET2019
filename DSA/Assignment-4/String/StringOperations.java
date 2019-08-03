package String;

import java.util.HashMap;
import java.util.Map;

public class StringOperations {

	Map<String, Integer> stringMap = new HashMap<>();
	Map<Character, Integer> charMap = new HashMap<>();

	int findTotalUniqueCharacters(String expression) {
		int result = 0;
		if (stringMap.get(expression) == null) {
			
			for (int index = 0; index < (expression.length()); index++) {
				if (charMap.get(expression.charAt(index)) == null)
					charMap.put(expression.charAt(index), 1);
				else
					charMap.put(expression.charAt(index), 0);
			}

			for (int charMapIndex = 0; charMapIndex < expression.length(); charMapIndex++) {
				result = result + charMap.get(expression.charAt(charMapIndex));
			}
		}

		else
			result = stringMap.get(expression);
		
		stringMap.put(expression,result);
		
		return result;
	}

	void storage(String expression, int noOfUniqueCharacters) {
		stringMap.put(expression, noOfUniqueCharacters);
	}
}
