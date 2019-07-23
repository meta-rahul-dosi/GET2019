import java.util.Arrays;
import java.lang.*;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class EvaluateTest {
	private int inputPoly1[] = new int[100]; 
	private float expectedResult;
	private Poly poly;

	@Before
	public void initialize() {
		poly = new Poly(inputPoly1);
	}

	public EvaluateTest(int[] poly1, Float expectedResult) {
		this.inputPoly1 = poly1;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] {
				{ new int[] { 1, 0, 2, 1, 4, 2 }, 7.00f },
				{ new int[] { 1, 0, 2, 1}, 3.00f },
				{ new int[] { 11, 0, 2, 1 }, 13.00f } });
	}

	@Test
	public void testEvaluate() {
		assertEquals(expectedResult, poly.evaluate(1.0f), 0.01f);
	}
}



