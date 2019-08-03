package Polynomial;

import java.util.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestCase {
	private int expectedResult;
	private Polynomial polynomial;

	@Before
	public void initialize() {
		polynomial = new Polynomial();
	}

	public TestCase(Integer expectedResult) {
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] { { 7 } });
	}

	@Test
	public void testing() {
		assertEquals(expectedResult, polynomial.returnDegree());
	}
}
