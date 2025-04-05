package lab4.zoo;

public class LewBaza implements ILew{

	@Override
	public void zaczep(LewCtx ctx) {
		System.out.println("Nie reaguje");
		
	}

	@Override
	public void nakarm(LewCtx ctx) {
		System.out.println("Bierze się do jedzenia");
		ctx.setStan(new LewJedzacy());
		
	}

	@Override
	public void zaspiewaj(LewCtx ctx) {
		System.out.println("Zasypia");
		ctx.setStan(new LewSpiacy());
		
	}

	@Override
	public void odbierz(LewCtx ctx) {
		System.out.println("Nie ma mu czego odebrać");
	}

}
