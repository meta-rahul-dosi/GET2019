import java.util.Arrays;
import java.lang.*;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DegreeTest {
	private int inputPoly1[] = new int[10];
	private int inputDegree1[] = new int[10];
	private int expectedResult;
	private Poly poly;

	@Before
	public void initialize() {
		poly = new Poly(inputPoly1, inputDegree1);
	}

	public DegreeTest(int[] poly1, int[] degree1, Integer expectedResult) {
		this.inputPoly1 = poly1;
		this.inputDegree1 = degree1;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] {
				{ new int[] { 1, 2, 4 },new int[] { 0, 1, 2 }, 2 },
				{ new int[] { 1, 2}, new int[] { 0, 2 }, 2 },
				{ new int[] { 11, 2 }, new int[] {0, 1}, 1 } });
	}

	@Test
	public void testEvaluate() {
		assertEquals(expectedResult, poly.degree());
	}
}



