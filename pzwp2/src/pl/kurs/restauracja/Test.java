package pl.kurs.restauracja;

public class Test {
    public static void main(String[] args) {
        przygotujZupe();
    }

    public static void przygotujZupe() {

        Zupa zupa = new Zur();
        Kucharz k = new Kucharz();
        Marchewka marchewka = new Marchewka();
        k.skladniki.add(marchewka);

        Ryz ryz = new Ryz();
        k.skladniki.add(ryz);

        k.przygotuj(zupa);
        Podawacz ke = new Kelner();
        if (ke instanceof Adresowalny)
            ((Adresowalny) ke).setAdres("Katowic");
        ke.podaj(zupa);
    }
}
