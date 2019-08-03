import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestFile{
	private int inputNumber;
	private int inputMarks[];
	private float expectedResult;
	private GradingCalculation grades;

	@Before
	public void initialize() {
		grades = new GradingCalculation();
	}

	public TestFile(int number, int[] inputNumber, float expectedResult) {
		this.inputNumber = number;
		this.inputMarks = inputNumber;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] {
				{ 6, new int[] { 5, 4, 9, 4, 9, 5}, 6 } });
	}

	@Test
	public void testFixXY() {
		assertEquals(expectedResult, grades.average(inputNumber, inputMarks), 0.02);
	}
}