package clase;

public class Client {
    private String numeClient;
    private String nrTelefon;
    private String adresaMail;

    public Client(String numeClient, String nrTelefon, String adresaMail) {
        super();
        this.numeClient = numeClient;
        this.nrTelefon = nrTelefon;
        this.adresaMail = adresaMail;
    }

    public Client(String numeClient) {
        super();
        this.numeClient = numeClient;
        this.nrTelefon = null;
        this.adresaMail = null;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getAdresaMail() {
        return adresaMail;
    }

    public void setAdresaMail(String adresaMail) {
        this.adresaMail = adresaMail;
    }
}
