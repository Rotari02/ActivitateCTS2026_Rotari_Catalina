package clase;

public abstract class DecoratorBilet implements IBilet{
    private IBilet biletDecorat;

    public DecoratorBilet(IBilet biletDecorat) {
        this.biletDecorat = biletDecorat;
    }

    @Override
    public void descriereBillet() {
        biletDecorat.descriereBillet();
    }

    public abstract void afisareUrare();
}
