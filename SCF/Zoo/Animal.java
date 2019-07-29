import java.util.*;
import java.lang.String;

public class Animal {

	void animal() {
		System.out.println("");
	}

	void selectionProcess(String type, String subtype, String name, String age, String weight) {
		switch (type) {

		case "mammal":
			Mammal mammal = new Mammal();
			mammal.newAnimal(type, subtype, name, age, weight);
			break;
		case "reptile":
			Reptile reptile = new Reptile();
			reptile.newAnimal(type, subtype, name, age, weight);
			break;
		case "bird":
			Bird bird = new Bird();
			bird.newAnimal(type, subtype, name, age, weight);
			break;
		case "default":
			System.out.println("this type of animal is not allowed here : ");
			break;
		}
	}

	String getSound(String type) {
		String sound = "";
		switch (type) {

		// sounds of mammals
		case "lion":
			sound = "roars";
			break;
		case "elephant":
			sound = "trumpet";
			break;
		case "horse":
			sound = "neigh";
			break;
		case "rabbit":
			sound = "clucking";
			break;
		case "deer":
			sound = "bleat";
			break;
		case "bear":
			sound = "grawl";
			break;
		case "wolf":
			sound = "howls";
			break;
		case "tiger":
			sound = "roars";
			break;
		case "leopard":
			sound = "snarl";
			break;

		// sounds of reptiles
		case "crocodile":
			sound = "growl";
			break;
		case "anaconda":
			sound = "hiss";
			break;
		case "python":
			sound = "hiss";
			break;
		case "chameleon":
			sound = "hiss";
			break;
		case "lizard":
			sound = "chirp";
			break;

		// sounds of birds
		case "sparrow":
			sound = "chirping";
			break;
		case "pigeon":
			sound = "coo";
			break;
		case "parrot":
			sound = "squawk";
			break;
		case "peacock":
			sound = "scream";
			break;

		case "default":
			sound = "not available in database";
			break;
		}
		return sound;
	}

}
