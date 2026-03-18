package ro.ase.cts.clase;

public class RezervareBuilder implements  AbstractBuilder{

    private Rezervare instance;

    public RezervareBuilder(String numeClient) {
        instance = new Rezervare(numeClient,false,false,false,"fara muzica");
    }

    @Override
    public Rezervare build() {
        return instance;
    }

    public RezervareBuilder setScauneErgonomice(Boolean scauneErgonomice) {
        instance.setScauneErgonomice(scauneErgonomice);
        return this;
    }

    public RezervareBuilder setDecorareMasa(Boolean decorareMasa) {
       instance.setDecorareMasa(decorareMasa);
       return this;
    }

    public RezervareBuilder  setGenMuzica(String genMuzica) {
        instance.setGenMuzica(genMuzica);
        return this;
    }
}
