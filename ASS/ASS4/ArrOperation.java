public class ArrOperation {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 2, 2, 3, 3, 4, 4, 5 };
		System.out.println("mirror" + maxMirror(arr));
		System.out.println("clumps" + noOfClumps(arr));
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

	static int[] fixXY(int[] arr)
	{
		int[] xy = new int[arr.length];
		int[] temp = new int[arr.length];
		int i=0,j=0;
		for(int index=0; index<arr.length; index++)
		{
			if(arr[index]==4)
			{
			 xy[index]=4;
			 xy[index+1]=5;
			}
			else
			{
				temp[++i]=arr[index];
			}
		}
		
        while(j<arr.length)
        	{
        	  if(arr[j]!=4)
        	  {
        		  arr[j]=temp[j];
        	  }
        	}
		
		
		return xy;
	}
	
	
}
