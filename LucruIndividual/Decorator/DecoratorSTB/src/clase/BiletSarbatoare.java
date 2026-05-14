package clase;

public class BiletSarbatoare extends DecoratorBilet{
    private String sarbatoare;
    public BiletSarbatoare(IBilet biletDecorat, String sarbatoare) {
        super(biletDecorat);
        this.sarbatoare=sarbatoare;
    }

    @Override
    public void descriereBillet() {
        super.descriereBillet();
        this.afisareUrare();
    }

    @Override
    public void afisareUrare() {
        System.out.println("Cu ocazia zilei de "+this.sarbatoare+" compania STB va ureaza LA MULTI ANI!");
    }
}
