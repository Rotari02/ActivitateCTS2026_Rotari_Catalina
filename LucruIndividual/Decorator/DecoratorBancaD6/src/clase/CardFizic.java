package clase;

public class CardFizic implements ICardBancar {
    @Override
    public void platesteOnline(double suma) {
        System.out.println("Ati realizat o plata cu cardul online in valoare de " + suma + " RON!");
    }

    @Override
    public void platesteCardNormal(double suma) {
        System.out.println("Ati realizat o plata cu cardul (normal) in valoare de " + suma + " RON!");
    }
}
