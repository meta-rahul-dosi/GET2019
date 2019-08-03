import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IsMemberTest {
	private int inputArray1[];
	private int desiredNumber;
	private boolean expectedResult;
	private IntSet intset;

	@Before
	public void initialize() {
		intset = new IntSet(inputArray1);
	}

	public IsMemberTest(int[] array1, int desiredNo, Boolean expectedResult) {
		this.inputArray1 = array1;
		desiredNumber = desiredNo;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] {
				{ new int[] { 1, 2, 2, 3, 4, 4 }, 6, false },
				{ new int[] { 1, 1, 2, 1, 5 }, 5, true },
				{ new int[] { 1, 1, 1, 1 }, 4, false } });
	}

	@Test
	public void testIsMemberTest() {
		assertEquals(expectedResult, intset.isMember(desiredNumber));
	}
}
