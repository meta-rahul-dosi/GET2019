package VCP;

public class CommandPrompt {

	public Node root = null;
	private Node currentParent;
	private Node currentDirectory = null;
	String path = "";

	void root() {
		Node node = new Node();
		node.name = "root";
		node.parent = null;
		root = node;
		path = path + root.name + ":/>";
		System.out.println(path);
		currentParent = root;
		currentDirectory = root;
	}

	void updatePath(String folderName) {
		path = path.replace(path.substring(path.length() - 1), "");
		path = path + folderName + "/>";
		System.out.println(path);
	}

	void mkdir(String command) {

		// fetching folder name from whole command
		String folderName = "";
		String temp = "";
		for (int index = 6; index <= command.length() - 1; index++) {
			temp = Character.toString(command.charAt(index));
			folderName += temp;
		}

		Node node = new Node();
		node.name = folderName;
		node.parent = currentParent;
		currentDirectory.children.add(node);
		System.out.println(path);
	}

	void cd(String command) {

		// fetching folder name from whole command
		String folderName = "";
		String temp = "";
		for (int index = 3; index <= command.length() - 1; index++) {
			temp = Character.toString(command.charAt(index));
			folderName += temp;
		}
		
		updatePath(folderName);

		Node node = new Node();
		node.name = folderName;
		currentDirectory = node;
	}
}
