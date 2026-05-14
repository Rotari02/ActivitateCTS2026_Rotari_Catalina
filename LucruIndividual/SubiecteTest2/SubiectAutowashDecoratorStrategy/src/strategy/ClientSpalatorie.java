package strategy;

public class ClientSpalatorie {
    private String nmeClient;
    private IModPlatesteStrategy modPlata;

    public ClientSpalatorie(String nmeClient) {
        this.nmeClient = nmeClient;
    }

    public void setModPlata(IModPlatesteStrategy modPlata) {
        this.modPlata = modPlata;
    }

    public  void achitaSplare(double suma){
        System.out.println("Clientul "+this.nmeClient+" efectueaza plata: ");
        this.modPlata.plateste(suma);
    }
}
