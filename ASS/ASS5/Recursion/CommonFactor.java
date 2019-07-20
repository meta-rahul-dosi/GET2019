public class CommonFactor {

	private int i = 1;

	public int HCF(int firstNo, int secondNo) {
		if (firstNo == 0)
			return secondNo;
		return HCF(secondNo % firstNo, firstNo);
	}

	public int LCM(int firstNo, int secondNo) {

		if (firstNo % secondNo == 0)
			return firstNo;

		if (firstNo < secondNo) {
			int temp = firstNo;
			firstNo = secondNo;
			secondNo = temp;

		}
		i = i+1;
		return LCM(i*(firstNo/(i-1)), secondNo);
	}

}
