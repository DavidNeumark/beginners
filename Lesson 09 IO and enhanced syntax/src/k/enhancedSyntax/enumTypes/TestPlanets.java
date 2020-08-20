package k.enhancedSyntax.enumTypes;

import java.util.Arrays;
import java.util.Scanner;

public class TestPlanets {

	public static void main(String[] args) {
		Planet p1 = Planet.EARTH;

		System.out.println(p1);
		System.out.println(p1.getMass());
		System.out.println(p1.getOrbit());

		Scanner sc = new Scanner(System.in);
		// array of all enum constants
		System.out.println("Enter Planet: " + Arrays.toString(Planet.values()));
		String input = sc.nextLine();
		sc.close();
		// String to enum
		Planet p2 = Planet.valueOf(input);
		System.out.println(p2);
		System.out.println("mass " + p2.getMass());
		System.out.println("orbit " + p2.getOrbit());
		System.out.println("ordinal " + p2.ordinal());
	}

}
