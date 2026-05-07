package clase;

public class CardContactless extends DecoratorCard {
    public CardContactless(ICardBancar cardBancarDecorat) {
        super(cardBancarDecorat);
    }

    @Override
    public void platesteContactless(double suma) {
        System.out.println("Ati realizat o plata cu cardul contactless in valoare de " + suma + " RON!");
    }
}
