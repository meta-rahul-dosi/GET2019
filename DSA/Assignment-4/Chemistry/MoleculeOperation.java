package Chemistry;

public class MoleculeOperation {

	Node root = null;

	void formTree(String compound) {		
		root.element = "MOLECULE";
		root.subElement = null;
		
		for (int index = 0; index < compound.length(); index++) 
		{			
			if(compound.charAt(index)=='C' || compound.charAt(index)=='O' || compound.charAt(index)=='H')
			{
				Node node = new Node();
				root.subElement.add(node);
			}
			
			else if(compound.charAt(index) == '(')
			{
				Node node1 = new Node();
				node1 = root.
				int innerIndex = index;
				char temp = ' ';
				while (temp != ')') {
					
				}
			}
			
		    if(compound.charAt(index) == ')')
		    {
		    	
		    }
		}
		Node node = new Node();	
		node.element = compound;
 		
	}
}
