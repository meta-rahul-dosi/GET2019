import java.util.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestCase {
	private int coeff;
	private List<Character> variables = new ArrayList<>();
	private List<Integer> powers = new ArrayList<>();
	private int expectedResult;
	private Polynomial polynomial;

	@Before
	public void initialize() {
		polynomial = new Polynomial();
	}

	public TestCase(int coeff, List<Character> variables, List<Integer> powers, Integer expectedResult) {
		this.coeff = coeff;
		this.variables = variables;
		this.powers = powers;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] {{4}});
	}

	@Test
	public void testing() {
		assertEquals(expectedResult, polynomial.visualize(coeff, variables, powers));
	}
}


