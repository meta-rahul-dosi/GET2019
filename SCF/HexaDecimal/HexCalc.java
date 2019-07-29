public class HexCalc {

	String add(String hex1, String hex2) {
		int dec1 = Integer.parseInt(hex1, 16);
		int dec2 = Integer.parseInt(hex2, 16);
		int sum = dec1 + dec2;
		String add = Integer.toHexString(sum);
		return add;
	}

	String subtract(String hex1, String hex2) {
		int dec1 = Integer.parseInt(hex1, 16);
		int dec2 = Integer.parseInt(hex2, 16);
		int minus = dec1 - dec2;
		String sub = Integer.toHexString(minus);
		return sub;
	}

	String multiply(String hex1, String hex2) {
		int dec1 = Integer.parseInt(hex1, 16);
		int dec2 = Integer.parseInt(hex2, 16);
		int mul = dec1 * dec2;
		String into = Integer.toHexString(mul);
		return into;
	}

	String division(String hex1, String hex2) {
		int dec1 = Integer.parseInt(hex1, 16);
		int dec2 = Integer.parseInt(hex2, 16);
		int div = 0;
		if (dec1 > dec2)
			div = dec1 / dec2;
		else
			div = dec2 / dec1;
		String divide = Integer.toHexString(div);
		return divide;
	}

	int hex2dec(String hex) {
		int dec = Integer.parseInt(hex, 16);
		return (dec);
	}

	void dec2hex(int dec) {
		String hex = Integer.toHexString(dec);
		System.out.println(hex);
	}

	boolean compare(String hex1, String hex2) {
	    int compareStatus = hex1.compareTo(hex2);
		if (compareStatus == 0)
			return true;
		else
			return false;
	}
}
