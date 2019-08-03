import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SubtractTest {
	private String hex1, hex2;
	private String expectedResult;
	private HexCalc hexcalc;

	@Before
	public void initialize() {
		hexcalc = new HexCalc();
	}

	public SubtractTest(String inputNumber1, String inputNumber2,
			String expectedResult) {
		this.hex1 = inputNumber1;
		this.hex2 = inputNumber2;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] { { "8a5c", "123", "8939" },
				{ "8ab", "123", "788" } });
	}

	@Test
	public void testSub() {
		assertEquals(expectedResult, hexcalc.subtract(hex1, hex2));
	}
}
