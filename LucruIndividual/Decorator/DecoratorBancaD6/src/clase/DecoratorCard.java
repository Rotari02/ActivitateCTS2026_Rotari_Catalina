package clase;

public abstract class DecoratorCard implements ICardBancar {
    private ICardBancar cardBancarDecorat;

    public DecoratorCard(ICardBancar cardBancarDecorat) {
        this.cardBancarDecorat = cardBancarDecorat;
    }

    @Override
    public void platesteCardNormal(double suma) {
        this.cardBancarDecorat.platesteCardNormal(suma);
    }

    @Override
    public void platesteOnline(double suma) {
        this.cardBancarDecorat.platesteOnline(suma);
    }

    public abstract void platesteContactless(double suma);
}
