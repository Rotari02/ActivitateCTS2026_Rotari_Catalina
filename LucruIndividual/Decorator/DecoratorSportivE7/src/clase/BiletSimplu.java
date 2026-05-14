package clase;

public class BiletSimplu implements IBilet {
    private String echipaGaza;
    private  String echipaOaspete;

    public BiletSimplu(String echipaGaza, String echipaOaspete) {
        this.echipaGaza = echipaGaza;
        this.echipaOaspete = echipaOaspete;
    }

    public String getEchipaGaza() {
        return echipaGaza;
    }

    @Override
    public void printeaza() {
        System.out.println("Bilet pentrun meciul: "+echipaGaza+" - "+echipaOaspete);
    }
}
