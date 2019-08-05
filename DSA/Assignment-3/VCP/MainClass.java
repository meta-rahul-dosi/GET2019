package VCP;

import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class MainClass {

	private Scanner scanner = new Scanner(System.in);
	private static MainClass main = new MainClass();
	private static CommandPrompt cmd = new CommandPrompt();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		cmd.root();
		main.inputCommand();
	}

	void inputCommand() {

		String command = " ";
		while (command.charAt(0) != 'e') {

			command = scanner.nextLine();

			switch (command.charAt(0)) {

			case 'm':
				cmd.mkdir(command);
				break;

			case 'c':
				break;
			case 'b':
				break;
			case 'e':
				break;

			default:
				System.out.println("cannot process given command");
			}
			
		}
	}
}
