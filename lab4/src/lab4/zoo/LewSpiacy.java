package lab4.zoo;

public class LewSpiacy extends LewBaza implements ILew{

	@Override
	public void zaspiewaj(LewCtx ctx) {
		System.out.println("Budzi się");
		ctx.setStan(new LewSpacerujacy());
		
	}


}
