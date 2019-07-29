import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LCMTest {
	private int firstNo, secondNo, expectedResult;
	private CommonFactor commonfactor;

	@Before
	public void initialize() {
		commonfactor = new CommonFactor();
	}

	public LCMTest(int firstNo, int secondNo, int expectedResult) {
		this.firstNo = firstNo;
		this.secondNo = secondNo;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] { { 15, 35, 105}, { 11, 4, 44 },
				{ 20, 28, 140} });
	}

	@Test
	public void testLCM() {
		assertEquals(expectedResult, commonfactor.LCM(firstNo, secondNo));
	}
}