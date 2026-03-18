package ro.ase.cts.clase;

public class RezervareBuilderV2 implements AbstractBuilderV2 {
    private String numeClient;
    private Boolean asezareGeam;
    private Boolean scauneErgonomice;
    private Boolean decorareMasa;
    private String genMuzica;

    public RezervareBuilderV2() {
        this.asezareGeam = false;
        this.scauneErgonomice = false;
        this.decorareMasa = false;
        this.genMuzica = "Fara muzica";
    }

    public RezervareBuilderV2 setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public RezervareBuilderV2 setAsezareGeam(Boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
        return this;
    }

    public RezervareBuilderV2 setScauneErgonomice(Boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }

    public RezervareBuilderV2 setDecorareMasa(Boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    public RezervareBuilderV2 setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }


    @Override
    public Rezervare2 build(String numeClient) {
        return new Rezervare2(numeClient,asezareGeam,scauneErgonomice,decorareMasa,genMuzica);
    }
}
