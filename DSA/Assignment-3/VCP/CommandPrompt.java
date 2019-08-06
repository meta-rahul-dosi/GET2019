package VCP;

public class CommandPrompt {

	public Node root = null;
	private Node currentParent = new Node();
	private Node currentDirectory = null;
	// public Node traversalNode = null;
	String path = "";

	void root() {
		Node node = new Node();
		node.name = "root";
		node.parent = null;
		root = node;
		path = path + root.name + ":/>";
		System.out.println(path);
		currentParent = root;
	}

	void updatePath(String folderName) {
		path = path.replace(path.substring(path.length() - 1), "");
		path = path + folderName + "/>";
		System.out.println(path);
	}

	void mkdir(String command) {
		String folderName = "";
		String temp = "";
		for (int index = 6; index <= command.length() - 1; index++) {
			temp = Character.toString(command.charAt(index));
			folderName += temp;
		}

		Node node = new Node();
		node.name = folderName;
		node.parent = currentParent;
		currentParent.children.add(node);
		currentDirectory = node;
       System.out.println(path);
       //System.out.println(root.children);
	}
	
	void cd(String command)
	{
		
		if(currentParent != root)
		{
		currentDirectory = currentParent;
		currentParent = currentParent.parent;
		updatePath(currentDirectory.name);
	}
		else
		{
		  System.out.println(path);	
		}
		String folderName="";
		String temp="";
		for (int index = 6; index <= command.length() - 1; index++) {
			temp = Character.toString(command.charAt(index));
			folderName += temp;
		}
	}
}

