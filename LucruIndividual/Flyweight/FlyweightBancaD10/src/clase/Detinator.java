package clase;

public class Detinator {
    protected String nume;
    protected String cnp;
    protected String adresa;
    protected String adresaEmail;
    protected String nrTelefon;

    public Detinator(String nume, String cnp, String adresa, String adresaEmail, String nrTelefon) {
        this.nume = nume;
        this.cnp = cnp;
        this.adresa = adresa;
        this.adresaEmail = adresaEmail;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Detinator{");
        sb.append("nume='").append(this.nume).append('\'');
        sb.append(", cnp='").append(this.cnp).append('\'');
        sb.append(", adresa='").append(this.adresa).append('\'');
        sb.append(", adresaEmail='").append(this.adresaEmail).append('\'');
        sb.append(", nrTelefon='").append(this.nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
