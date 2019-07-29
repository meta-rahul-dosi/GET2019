import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SizeTest {
	 private int inputArray1[];
	 private int expectedResult;
	 private IntSet intset;
	 
	 @Before
	 public void initialize() {
		 intset = new IntSet(inputArray1);
	 }
	 
	 public SizeTest(int[] array1, Integer expectedResult) {
	      this.inputArray1 = array1;
	      this.expectedResult = expectedResult;
	 }
	 
	 @Parameterized.Parameters
	   public static Collection<Object[]> parameters() {
	      return Arrays.asList(new Object[][] {
	         {  new int[]{1, 2, 2, 3, 4, 4}, 6 },
	         {  new int[]{1, 1, 2, 1, 1}, 5 },
	         {  new int[]{1, 1, 1, 1, }, 4 },
	         {  new int[]{1, 4, 5, 3, 5, 4, 1}, 7 },
	         {  new int[]{1, 1, 1, 8, 9, 3, 2, 1}, 8 }
	      });
	   }
	   
	   @Test
	   public void testSize() {
	      assertEquals(expectedResult, 
	      intset.size());
	   } 
}

