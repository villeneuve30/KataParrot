package fr.unilim.iut.KataParrot;

public class AfricanParrot extends Parrot{
	
	private static final double LOAD_FACTOR = 9.0;
	private int numberOfCoconuts = 0;

	public AfricanParrot(int numberOfCoconuts) {
		this.numberOfCoconuts = numberOfCoconuts;
	}
	
	@Override
	public double getSpeed() {
		return Math.max(0, BASE_SPEED - AfricanParrot.LOAD_FACTOR * numberOfCoconuts);
	}
}
