package VCP;

import java.util.*;

public class MainClass {

	private Scanner scanner = new Scanner(System.in);
	private static MainClass main = new MainClass();
	private static CommandPrompt commandPrompt = new CommandPrompt();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		commandPrompt.root();
		main.inputCommand();
	}

	void inputCommand() {

		String command = " ";
		while (command.charAt(0) != 'e') {

			command = scanner.nextLine();

			switch (command.charAt(0)) {

			case 'm':
				commandPrompt.mkdir(command);
				break;

			case 'c':
				commandPrompt.cd(command);
				break;

			case 'e':
				System.out.println("THE END");
				break;

			default: {
				System.out.println("cannot process given command");

			}
			}
		}
	}
}
