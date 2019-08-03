import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AddTest {
	private String hex1, hex2;
	private String expectedResult;
	private HexCalc hexcalc;

	@Before
	public void initialize() {
		hexcalc = new HexCalc();
	}

	public AddTest(String inputNumber1, String inputNumber2,
			String expectedResult) {
		this.hex1 = inputNumber1;
		this.hex2 = inputNumber2;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] { { "8a5c", "f39a", "17df6" },
				{ "8ab", "123", "9ce" } });
	}

	@Test
	public void testAdd() {
		assertEquals(expectedResult, hexcalc.add(hex1, hex2));
	}
}
