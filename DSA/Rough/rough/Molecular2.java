package rough;

import java.util.HashMap;
import java.util.Stack;

public class Molecular2 {
	
	public HashMap<Character, Integer> elements = new HashMap<Character, Integer>();
	
	public int getMass(String string)
	{
		System.out.println(" ========================================================");
		System.out.println(" string: " + string + " stringLen: " + string.trim().length());
		string = string.toUpperCase();
		
		elements.put('C', 12);
		elements.put('O', 16);
		elements.put('H', 1);
		
		
		int mass = 0;
		int index = 0;
		char currentChar = 0;
		
		Stack<Integer> stack1 = new Stack<Integer>();
		while ( index < string.length()) 
		{
			
			currentChar = string.charAt(index);
			
			if ( (currentChar >= 65 && currentChar <= 90))
			{
				stack1.push(elements.get(currentChar));
//				System.out.println(" index: " + index); //HC2H3
//				mass += elements.get(currentChar);
				index ++;
			}
			else if (currentChar >= 48 && currentChar <= 57) 
			{
				System.out.println(" currChar: " + currentChar);
				
				System.out.println(" stack: " + stack1);
				int dist = index;
				
				while( dist < string.length() && isInteger(string.charAt(dist)))
				{
					System.out.println(" dist: " + dist);
					dist++;
				}
				int temp = stack1.pop();
//				System.out.println(" dist: " + dist + " substring: " + string.substring(index, dist));
				int numeric = Integer.valueOf(string.substring(index, dist));
//				System.out.println("temp" + temp + " numeric: " + numeric);
				
				//updating index to char next to the numeric
				index = dist;
				
				System.out.println(currentChar + " temp: " + temp + " temp*numeric: " + temp*numeric);
				stack1.push(temp*numeric);
				
//				mass += stack1.pop();
//				System.out.println(" stack1: " + stack1);
			}
			else if (currentChar=='(')
			{
				index++;
				int dist = index;
				
				Stack<Character> stack2 = new Stack<Character>();
				stack2.push('(');
				String temp = "";
				while(!stack2.isEmpty())
				{
					if (string.charAt(dist) == '(') {
						temp += '(';
						stack2.push('(');
					}
					else if (string.charAt(dist) == ')') {
						stack2.pop();
						temp +=')';
					}
					else
					{
						temp += string.charAt(dist);
					}
					dist++;
				}
				
				temp = temp.substring(0, temp.length()-1);
				System.out.println(" TTTTTTTTT: " + temp);
//				
//				while(string.charAt(dist) != ')') // H(C2H)30
//				{
//					dist++;
////					System.out.println("dist1: " + dist);
//					
//				}
				int dist2 = dist;
				while (dist2 < string.length() && isInteger(string.charAt(dist2))) {
					
//					System.out.println(" dist2: " + dist2);
					dist2++;
				}
				
				System.out.println("===> " + temp);
				System.out.println(" su===> " + string.substring(dist, dist2));
				
				System.out.println(" mass1: " + mass);
			mass += (getMass(temp)* Integer.valueOf( string.substring(dist, dist2)) + getMass(string.substring(dist2)));
				System.out.println(" mass2: " + mass);
				index = string.length();
				System.out.println(" index is: " + index);
			}
		}
		
		System.out.println(" satck is empty: " + stack1.isEmpty());
		while(!stack1.isEmpty())
		{

			System.out.println( "?????" + stack1);
			int s = stack1.pop();
			System.out.println("s: " + s);
			
			mass += s;
			
		}
		System.out.println(" FINISH");
		return mass;
	}
	

	/**function to check weather the given char is integer or not?
	 * @param currentChar, 
	 * @return true if given char is integer o/w returns false
	 */
	public boolean isInteger(char currentChar) {

		if (currentChar >= 48 && currentChar <= 57) {
			return true;
		}
		return false;
	}
	
	public static void main(String ... args){
		
		Molecular2 molecular = new Molecular2();
		System.out.println("total mass: " + molecular.getMass("CHOC(CH3)3"));
		
		
	}
}
