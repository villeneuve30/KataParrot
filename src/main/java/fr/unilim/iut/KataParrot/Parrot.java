package fr.unilim.iut.KataParrot;

public class Parrot {

	private static final double LOAD_FACTOR = 9.0;
	protected static final double BASE_SPEED = 12.0;
	private ParrotTypeEnum type;
	private int numberOfCoconuts = 0;
	private double voltage;
	private boolean isNailed;

	public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
		this.type = _type;
		this.numberOfCoconuts = numberOfCoconuts;
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	public double getSpeed() {
		switch (type) {
		case EUROPEAN:
		throw new RuntimeException("Should be unreachable");
		case AFRICAN:
			return Math.max(0, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
		case NORWEGIAN_BLUE:
			return (isNailed) ? 0 : getBaseSpeed(voltage);
		}
		throw new RuntimeException("Should be unreachable");
	}

	private double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage * BASE_SPEED);
	}

}
