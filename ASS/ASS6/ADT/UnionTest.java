import java.util.Arrays;
import java.util.Collection;
import java.lang.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UnionTest {
	 private int inputArray1[];
	 private int[] expectedResult;
	 private IntSet intset;
	 
	 @Before
	 public void initialize() {
		 intset = new IntSet(inputArray1);
		 intset.set1 = new int[]{1,2,4,5,7};
		 intset.set2 = new int[]{3,4,5,9};
	 }
	 
	 public UnionTest(int[] expectedResult) {
	      this.expectedResult = expectedResult;
	 }
	 
	 @Parameterized.Parameters
	   public static Collection<Object[]> parameters() {
	      return Arrays.asList(new Object[][] {
	         { new int[]{1,2,3,4,5,7,9}}
	      });
	   }
	   
	   @Test
	   public void testSize() {
	      assertEquals(expectedResult, 
	      Arrays.toString(intset.union(intset,intset)));
	   } 
}

