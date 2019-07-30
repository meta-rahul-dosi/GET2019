import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

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
		return Arrays.asList(new Object[][] {{4}});
	}

	@Test
	public void testing() {
		assertEquals(expectedResult, polynomial.returnDegree());
	}
}

