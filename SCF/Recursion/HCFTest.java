import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class HCFTest {
	private int firstNo, secondNo, expectedResult;
	private CommonFactor commonfactor;

	@Before
	public void initialize() {
		commonfactor = new CommonFactor();
	}

	public HCFTest(int firstNo, int secondNo, int expectedResult) {
		this.firstNo = firstNo;
		this.secondNo = secondNo;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] { { 15, 35, 5}, { 11, 4, 1 },
				{ 20, 28, 4 } });
	}

	@Test
	public void testHCF() {
		assertEquals(expectedResult, commonfactor.HCF(firstNo, secondNo));
	}
}