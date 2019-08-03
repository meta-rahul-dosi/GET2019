import java.util.Scanner;

public class ZooManagement {

	public static void main(String[] args) {

		System.out.println("Welcome to International Zoo !!\n");

		System.out.println("Bring Animal to be kept inside zoo : ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter type of animal (mammal/reptile/bird)");
		String type = scanner.nextLine();
		System.out.println("enter type of " + type);
		String subtype = scanner.nextLine();
		System.out.println("enter name of animal");
		String name = scanner.nextLine();
		System.out.println("enter its age");
		String age = scanner.nextLine();
		System.out.println("enter its weight");
		String weight = scanner.nextLine();

		Animal animal = new Animal();

		animal.selectionProcess(type, subtype, name, age, weight);
		animal.getSound(type);

		scanner.close();
	}
}
