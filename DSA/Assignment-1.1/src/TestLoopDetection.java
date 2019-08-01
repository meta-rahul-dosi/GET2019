import java.util.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestLoopDetection{
	private int[] list;
	private boolean expectedResult;
	private DetectLoop loop;

	@Before
	public void initialize() {
		loop =new DetectLoop();
		loop.createLinkedList(list);
	}

	public TestLoopDetection(int[] list, Boolean expectedResult) {
		this.expectedResult = expectedResult;
		this.list = list;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] {
				{ new int[] {2,3,4,5,6,7}, true }
				});
	}

	@Test
	public void testing() {
		assertEquals(expectedResult, loop.loopDetector());
	}
}


