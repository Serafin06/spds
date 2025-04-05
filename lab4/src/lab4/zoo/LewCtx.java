package lab4.zoo;

public class LewCtx {
    private ILew stan;

    public LewCtx() {
        this.stan = new LewSpacerujacy();
    }

    public void setStan(ILew stan) {
        this.stan = stan;
    }

    public ILew getStan() {
        return stan;
    }

    public void zaczep() {
        stan.zaczep(this);
    }

    public void nakarm() {
        stan.nakarm(this);
    }

    public void zaspiewaj() {
        stan.zaspiewaj(this);
    }

    public void odbierz() {
        stan.odbierz(this);
    }
}
