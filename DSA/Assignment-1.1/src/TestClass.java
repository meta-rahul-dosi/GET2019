import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestClass{
	private int inputList[];
	private int[] expectedResult;
    private int leftEnd, rightEnd, noOfRotations;
	private LinkedList list;

	@Before
	public void initialize() {
		list =new LinkedList();
	}

	public TestClass(int[] inputlist, int leftEnd, int rightEnd, int noOfRotations, int[] expectedResult) {
		this.inputList = inputlist;
		this.leftEnd = leftEnd;
		this.rightEnd = rightEnd;
		this.noOfRotations = noOfRotations;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] {
				{ new int[] { 2, 3, 4, 5, 6, 7 }, 2, 5, 2, new int[] {2, 5, 6, 3, 4, 7} }
				});
	}

	@Test
	public void testingY() {
		assertEquals(Arrays.toString(expectedResult), Arrays.toString(list.afterRotation(inputList, leftEnd, rightEnd, noOfRotations)));
	}
}


