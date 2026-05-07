package main;

import clase.PachetCazare;
import clase.PachetMasinaInchiriata;
import clase.PachetTuristic;
import inchiriereMasini.Masina;
import inchiriereMasini.MasinaInchiriata;

public class Main {
    private static void printeazaRezervare(PachetTuristic pachetTuristic) {
        System.out.println("Pentru client:");
        pachetTuristic.descriere();
        System.out.println("Pentru operator: ");
        pachetTuristic.rezervaPachet();
    }

    public static void main(String[] args) {
        PachetTuristic pachetCazare = new PachetCazare();
        printeazaRezervare(pachetCazare);
        System.out.println("____________________________");
        System.out.println("Se vrea utilizarea librariei pentru masini inchiriate.");

        System.out.println();
        System.out.println("Utilizare in maniera clasica:");
        Masina masina = new Masina("Audi", 1500);
        MasinaInchiriata masinaInchiriata = new MasinaInchiriata(masina);

        System.out.println();
        System.out.println("Nu utilizam metoda de printare");
        System.out.println("Pentru client: ");
        System.out.println(masinaInchiriata.toString());
        System.out.println("Pentru Operator: ");
        masinaInchiriata.inchiriazaMasina();

        System.out.println();
        System.out.println("Utilizam Adapterul de clase");
        Masina masinaAdaptata = new Masina("Volvo", 1300);

        System.out.println();
        System.out.println("Acum pachetul este creat direct cu masina dorita prin adapter");
        PachetMasinaInchiriata pachetMasinaInchiriata = new PachetMasinaInchiriata(masinaAdaptata);
        System.out.println();
        System.out.println("Se foloseste metoda de printare");
        printeazaRezervare(pachetMasinaInchiriata);


    }

}
