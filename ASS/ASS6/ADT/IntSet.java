import java.util.Arrays;
import java.util.Scanner;

public final class IntSet {

	private final int array1[];
	public int subset[];
	protected int set1[], set2[];

	IntSet(int set1[]) {
		this.array1 = set1;
	}

	public int size() {
		return array1.length;
	}

	public boolean isMember(int desiredNumber) {
		int index = 0;
		boolean status = false;
		Scanner scanner = new Scanner(System.in);
		do {
			if (array1[index] == desiredNumber) {
				status = true;
				return status;
			}
			index++;
		} while (index < array1.length);
		return status;
	}

	public int[] getComplement(int[] array) {
		int complementIndex = 0;
		int number = 0;
		int[] complementArray = new int[10 - array.length];
		for (int index = 0; index < array.length; index++) {
			int flag = 0;
			for (int check = 1; check <= 10; check++) {
				if (check == array[index]) {
					flag = 1;
					number = check;
				}
			}
			if (flag == 0)
				complementArray[complementIndex++] = number;
		}
		return complementArray;
	}

	public boolean isSubSet(IntSet obj) {
		int count = 0;
		boolean status = false;
		for (int index = 0; index <= obj.subset.length - 1; index++) {
			for (int innerIndex = 0; innerIndex < array1.length; innerIndex++) {
				if (obj.subset[index] == array1[innerIndex]) {
					count++;
					continue;
				}
			}
		}
		if (count == subset.length)
			status = true;
		return status;
	}

	int[] union(IntSet s1, IntSet s2) {
		int index =0 ;
		int[] union = new int[s1.set1.length + s2.set2.length];
		for(int index1 = 0; index1 < s1.set1.length; index1++)
		{
			union[index++] = s1.set1[index1];
		}
			for(int index2 = 0; index2 < s2.set2.length; index2++)
			{
				int flag = 0;
				for(int innerIndex = 0; innerIndex < union.length; innerIndex++)
				{
					if(union[innerIndex] == s1.set2[index2])
						flag=1;
				}
				if(flag == 0)
					union[index++]=s2.set2[index2];
			}
		return union;
	}
}
