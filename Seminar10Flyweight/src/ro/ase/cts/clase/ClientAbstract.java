package ro.ase.cts.clase;

public interface ClientAbstract {
    void printeazaRezervare(Rezervare rezervare);

    void plateste(Rezervare rezervare, double taxaPerPersoana);
}
