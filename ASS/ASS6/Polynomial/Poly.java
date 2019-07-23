public final class Poly {
	int poly1[] = new int[100];
	int degree1[] = new int[100];
	int poly2[] = new int[100];
	int degree2[] = new int[100];
	
	Poly(int[] inputPoly1, int[] inputDegree1) {
		this.poly1 = inputPoly1;
		this.degree1 = inputDegree1;
	}

	Poly(int[] inputPoly1, int[] inputDegree1, int[] inputPoly2, int[] inputDegree2) {
		this.poly1 = inputPoly1;
		this.degree1 = inputDegree1;
		this.poly2 = inputPoly2;
		this.degree2 = inputDegree2;
	}
	
	float evaluate(float varValue) {
		float value = 0;
		for (int index = 0; index < degree1.length; index++) {
			value += poly1[index] * (Math.pow(varValue, degree1[index]));
		}
		return value;
	}
	
	int degree()
	{
		return degree1[degree1.length-1];
	}
	
	int[] addPoly(int[] poly1, int[] poly2)
	{
		int sum=0;
	  for(int index = 0; index < degree1.length; index++ )	
	  {
		  for(int innerIndex = 0; innerIndex < degree2.length; innerIndex++)
		  {
			  if(degree1[index] == degree2[index] == index)
				  sum = sum + (poly1[index1] + poly2[index2]);  
		  }
	  }
	}
}
