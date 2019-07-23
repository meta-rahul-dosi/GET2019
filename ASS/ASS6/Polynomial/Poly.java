public final class Poly {
	int poly1[] = new int[100];
	int poly2[] = new int[100];

	Poly(int[] inputPoly1) {
		this.poly1 = inputPoly1;	
	}

	Poly()
	{
	}
	
	float evaluate(float varValue) {
		float value = 0.0f;
		for (int index = 0; index < poly1.length; index = index+2) 
			value += poly1[index] * (Math.pow(varValue, poly1[index+1]));	
		return value;
	}
	
	int degree()
	{
		return poly1[poly1.length-1];
	}
	
	int[] addPoly(Poly p1, Poly p2)
	{
		int addIndex =0;
		int add[] = new int[p1.poly1.length + p2.poly2.length];
	  for(int index1 = 1; index1 < p1.poly1.length; index1 = index1+2 )	
	  {
		  for(int index2 = 1; index2 < p2.poly2.length; index2 = index2 + 2)
		  {
			  if(p1.poly1[index1] == p2.poly2[index2])
				{
				  add[addIndex++] = p1.poly1[index1] + p2.poly2[index2];
				  add[addIndex++] = p1.poly1[index1+1] + p2.poly2[index2+1];
				}
		  }
	  }
	  return add;
	}
}
