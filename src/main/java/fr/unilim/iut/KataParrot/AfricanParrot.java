package fr.unilim.iut.KataParrot;

public class AfricanParrot extends Parrot{
	
	protected static final double LOAD_FACTOR = 9.0;
	protected int numberOfCoconuts = 0;

	public AfricanParrot(int numberOfCoconuts) {
		super(ParrotTypeEnum.AFRICAN, 0, false);
		this.numberOfCoconuts = numberOfCoconuts;
	}
	
	@Override
	public double getSpeed() {
		return Math.max(0, BASE_SPEED - AfricanParrot.LOAD_FACTOR * numberOfCoconuts);
	}
}
