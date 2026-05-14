package clase;

public class BonCuFelicitare extends DecoratorBon{
    public BonCuFelicitare(IBon bonDecorat) {
        super(bonDecorat);
    }

    @Override
    public void prteazaFelicitare() {
        System.out.println("Farmacia noastra va ureaza UN AN NOU FERICIT!");
    }
}
