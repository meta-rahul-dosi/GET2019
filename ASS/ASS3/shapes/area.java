import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Area obj = new Area();
		System.out.println("enter width, height and radius");
		Scanner inputParameters = new Scanner(System.in);
		double width = inputParameters.nextDouble();
		double height = inputParameters.nextDouble();
		double radius = inputParameters.nextDouble();

		System.out.println("circle area is " + obj.circle(radius));
		System.out.println("triangle area is " + obj.triangle(width, height));
		System.out.println("square area is " + obj.square(width));
		System.out.println("rectangle area is " + obj.rectangle(width, height));
		inputParameters.close();
	}

	 double circle(double radius) {
		return (3.14 * radius * radius);
	}

	private double square(double width) {
		return (width * width);
	}

	private double rectangle(double width, double height) {
		return (width * height);
	}

	private double triangle(double width, double height) {
		return (width * height / 2);
	}
}
