import java.util.*;

public class ArrOperation {

	public static void main(String[] args) {
		ArrOperation obj = new ArrOperation();

		System.out.println("enter size of array : ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] arr = new int[size];

		arr = obj.inputArray(size);

		System.out.println("mirrors in given array is " + maxMirror(arr));
		System.out.println("clumps available in given array is "
				+ noOfClumps(arr));

		int[] xy = new int[arr.length];
		xy = fixXY(arr);
		System.out.println(Arrays.toString(xy));

		System.out.println("desiredIndex is "+obj.split(arr));
	}

	private int[] inputArray(int size) {
		int temp[] = new int[size];
		Scanner scanner = new Scanner(System.in);
		for (int index = 0; index < size; index++) {
			temp[index] = scanner.nextInt();
		}
		return temp;
	}

	static int maxMirror(int[] arr) {
		int[] reverse = new int[arr.length];
		int max = 0;

		for (int index = 0; index < arr.length; index++) {
			reverse[index] = arr[arr.length - 1 - index];
		}

		for (int rIndex = 0; rIndex < reverse.length; rIndex++) {
			for (int index = 0; index < arr.length; index++) {
				if (arr[index] == reverse[rIndex]) {
					max++;
				}

				else
					break;
			}
		}
		return max;
	}

	static int noOfClumps(int[] arr) {
		int number = 0, length = 0;

		for (int index = 1; index < arr.length; index++) {
			if (arr[index] == arr[index - 1]) {
				length++;
			} else {
				if (length != 0) {
					number++;
					length = 0;
				}
			}

		}
		return number;
	}

	private static int[] fixXY(int[] arr) {
		int[] xy = new int[arr.length];
		int[] temp = new int[arr.length];
		int i = 0, j = 0;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 4) {
				xy[index] = 4;
				xy[index + 1] = 5;
			} else {
				temp[i++] = arr[index];
			}
			i = 0;
			while (j < arr.length) {
				if (xy[j] != 4 || xy[j] != 5)
					xy[j] = temp[i++];
				j++;
			}
		}

		return xy;
	}

	private static int split(int[] arr) {

		int splitted[] = new int[arr.length];
		int i=0, j=arr.length-1, sum1=arr[0], sum2=arr[arr.length-1], desiredIndex=-1;
        while(desiredIndex==-1)
        {
        	if(sum1==sum2 && j==i+1)
        		desiredIndex = j;
        	else
        	{
        		sum1 += arr[++i];
        		sum2 += arr[--j];
        	}
        }
		return desiredIndex;
	}
}
