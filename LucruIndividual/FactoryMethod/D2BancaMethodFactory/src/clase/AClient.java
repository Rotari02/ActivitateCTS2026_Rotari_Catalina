package clase;

public abstract class AClient {
    private String nume;
    private String adresa;

    public AClient(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public abstract  void profilClient();
}

