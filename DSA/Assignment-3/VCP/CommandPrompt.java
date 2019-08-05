package VCP;

public class CommandPrompt {

	public Node root = null;
	String path = "";

	void root() {
		Node node = new Node();
		node.name = "root";
		node.parent = null;
		root = node;
		path = path + root.name + ":/>";
		System.out.println(path);
	}

	void updatePath() {
		path = path.replace(path.substring(path.length() - 1), "");
		path = path + "f1" + ">";
		System.out.println(path);

	}

	void mkdir(String command) {
		String folderName = "";
		String temp = "";
		for (int index = 6; index <= command.length() - 1; index++) {
			temp = Character.toString(command.charAt(index));
			folderName += temp;
		}
		System.out.println(folderName);
		updatePath();

		Node node = new Node();
		node.name = folderName;
		node.parent = root;

	}
}
