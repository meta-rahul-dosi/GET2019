import static org.junit.Assert.*;

import org.junit.Test;


public class SparseMatrixTest {
	
	@Test
	public void isSymmetry(){
		SparseMatrix sparseMatrix = new SparseMatrix(3, 3);
		
		sparseMatrix.insert(0, 0, 1);

		sparseMatrix.insert(0, 2, 2);

		sparseMatrix.insert(2, 0, 2);
		
		assertEquals(true, sparseMatrix.isSymmetry());	
	}

}
