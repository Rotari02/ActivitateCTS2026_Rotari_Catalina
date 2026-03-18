package ro.ase.cts.clase;

public class Rezervare extends ARezervare {
    @Override
    public void descriere() {
        System.out.println("Aceasta este o rezervare");
    }

    public Rezervare(String numeClient, int nrPersoane, String data, String ora) {
        super(numeClient, nrPersoane, data, ora);
    }

    @Override
    public ARezervare copiaza() {
        Rezervare rezervareNoua = new Rezervare();

        // setarea fiecarui atrib
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.nrPersoane = this.nrPersoane;
        rezervareNoua.data = this.data;
        rezervareNoua.ora = this.ora;

        return rezervareNoua;
    }
    public Rezervare() {

    }
}
