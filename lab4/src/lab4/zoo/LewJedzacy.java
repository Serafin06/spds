package lab4.zoo;

public class LewJedzacy extends LewBaza implements ILew{

	@Override
	public void zaczep(LewCtx ctx) {
		System.out.println("Warczy");
		
	}

	@Override
	public void nakarm(LewCtx ctx) {
		System.out.println("Je, nie przeszkadzac!");
		
	}

	@Override
	public void zaspiewaj(LewCtx ctx) {
		System.out.println("Warczy");
		
	}

	@Override
	public void odbierz(LewCtx ctx) {
		System.out.println("Odebrano mu jedzenie");
		ctx.setStan(new LewSpacerujacy());
		
	}

}
