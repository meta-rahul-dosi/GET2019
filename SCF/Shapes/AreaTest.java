import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AreaTest {
	private double inputNumber1;
	private double expectedResult;
	private Area area;

	@Before
	public void initialize() {
		area = new Area();
	}

	public AreaTest(double inputNumber, double expectedResult) {
		this.inputNumber1 = inputNumber;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] {
				{ 10, 314 },
				{ 11, 379.94 }});
	}

	@Test
	public void testCircleArea() {
		assertEquals(expectedResult, area.circle(inputNumber1), 0.14);
	}

}

