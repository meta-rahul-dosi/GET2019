package Chemistry;

public class MainClass {

	public static void main(String... args) {
		MolecularMass molecular = new MolecularMass();
		System.out.println("total mass: " + molecular.getMass("CHoh"));
	}
}
