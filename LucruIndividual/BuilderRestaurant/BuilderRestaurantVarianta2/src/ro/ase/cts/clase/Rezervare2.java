package ro.ase.cts.clase;

public class Rezervare2 {
    private String numeClient;
    private Boolean asezareGeam;
    private Boolean scauneErgonomice;
    private Boolean decorareMasa;
    private String genMuzica;

    protected Rezervare2(String numeClient, Boolean asezareGeam, Boolean scauneErgonomice, Boolean decorareMasa, String genMuzica) {
        this.numeClient = numeClient;
        this.asezareGeam = asezareGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare2{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", asezareGeam=").append(asezareGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}