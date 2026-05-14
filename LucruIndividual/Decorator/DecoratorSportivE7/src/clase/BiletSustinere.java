package clase;

public class BiletSustinere  extends DecoratorBilet {
    private String echipaLocala;

    public BiletSustinere(IBilet bilet, String echipaLocala) {
        super(bilet);
        this.echipaLocala = echipaLocala;
    }


    @Override
    public void printeazaMesajSustinere() {
       if(((BiletSimplu) biletDecorat).getEchipaGaza().equalsIgnoreCase(echipaLocala)){
           System.out.println("Hai "+echipaLocala+" fiti alaturi de echipa noastra in acest meci");
       }
    }
}
