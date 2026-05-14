package clase;

public abstract class DecoratorBon implements IBon{
    private IBon bonDecorat;

    public DecoratorBon(IBon bonDecorat) {
        this.bonDecorat = bonDecorat;
    }

    @Override
    public void printeazaBon() {
        this.bonDecorat.printeazaBon();
        prteazaFelicitare();
    }
    public abstract void prteazaFelicitare();
}
