package fr.unilim.iut.KataParrot;

public class EuropeanParrot extends Parrot{

	public EuropeanParrot() {
		super(ParrotTypeEnum.EUROPEAN,  0, 0, false);
	}
	
	@Override
	public double getSpeed() {
		return BASE_SPEED;
	}
}
