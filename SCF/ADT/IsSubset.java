import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IsSubset {
	private int inputArray1[];
	private boolean expectedResult;
	private IntSet intset;

	@Before
	public void initialize() {
		intset = new IntSet(inputArray1);
		intset.subset = new int[]{1,2,3};
	}
	
	public IsSubset(int[] array1, Boolean expectedResult) {
		this.inputArray1 = array1;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] {
				{ new int[] { 1, 2, 3, 5, 6, 8 }, true },
				{ new int[] { 1, 3, 4, 10 }, false },
				{ new int[] { 1, 2, 3, 4, 5, 7, 8, 9 }, true } });
	}

	@Test
	public void testSize() {
		assertEquals(expectedResult, intset.isSubSet(intset));
	}
}
