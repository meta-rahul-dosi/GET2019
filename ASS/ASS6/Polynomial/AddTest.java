import java.util.Arrays;
import java.lang.*;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AddTest {
	private float expectedResult;
	private Poly poly;

	@Before
	public void initialize() {
		poly = new Poly();
		poly.poly1 = new int[]{5,0,4,1,3,2};
		poly.poly2 = new int[]{3,0,4,2};
	}

	public AddTest(Float expectedResult) {
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] {
				{ new int[] { 8, 0, 4, 1, 7, 2 }}});
	}

	@Test
	public void testEvaluate() {
		assertEquals(expectedResult, poly.addPoly(poly, poly));
	}
}



