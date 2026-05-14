package clase;

public class Meci {
    private String denumire;
    private String data;
    private String ora;
    private TipMeci tipMeci;

    public Meci(String denumire, String data, String ora, TipMeci tipMeci) {
        this.denumire = denumire;
        this.data = data;
        this.ora = ora;
        this.tipMeci = tipMeci;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getData() {
        return data;
    }

    public String getOra() {
        return ora;
    }

    public TipMeci getTipMeci() {
        return tipMeci;
    }
}
