package clase;

public class ConcreteFlyweight implements IFlyweight{
   private Detinator destinatar;
   private Banca banca;

    public ConcreteFlyweight(Detinator destinatar, Banca banca) {
        this.destinatar = destinatar;
        this.banca = banca;
    }

    @Override
    public void descriereCont(DetaliiSpecificeCont detalii) {
        System.out.println(detalii.toString());
        System.out.println("----------------------");
        System.out.println(this.destinatar.toString());
        System.out.println("-----------------------");
        System.out.println(this.banca.toString());
    }
}
