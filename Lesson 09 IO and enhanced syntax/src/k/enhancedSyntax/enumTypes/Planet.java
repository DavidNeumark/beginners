package k.enhancedSyntax.enumTypes;

public enum Planet {

	MARS(544, 622), EARTH(1660, 1662), VENUS(112, 342);

	private int mass;
	private int orbit;

	private Planet(int mass, int orbit) {
		this.mass = mass;
		this.orbit = orbit;
	}

	public int getMass() {
		return mass;
	}

	public int getOrbit() {
		return orbit;
	}

}
