package main;

import clase.PachetCazare;
import clase.PachetMasinaInchiriataAdapter;
import clase.PachetTuristic;
import inchiriereMasini.Masina;
import inchiriereMasini.MasinaInchiriata;

public class Main {
    private static void printeazaRezervare(PachetTuristic pachetTuristic) {
        System.out.print("Pentru client: ");
        pachetTuristic.desciere();
        System.out.print("Pentru Operator: ");
        pachetTuristic.rezervaPachet();
    }

    public static void main(String[] args) {
        PachetTuristic pachetCazare = new PachetCazare();
        printeazaRezervare(pachetCazare);

        System.out.println("");
        System.out.println("se vrea folosirea librariei pentru masini inchiriate.");

        System.out.println();
        System.out.println("Utilizarea in modul clasic:");
        Masina masina = new Masina("Volvo", 1300);
        MasinaInchiriata masinaInchiriata = new MasinaInchiriata(masina);

        System.out.println();
        System.out.println("Nu se utilizaeaza metoda de printare.");
        System.out.print("Pentru client: ");
        System.out.println(masinaInchiriata.toString());
        System.out.print("Pentru Operator: ");
        masinaInchiriata.inchiriazaMasina();

        System.out.println();
        System.out.println("Se utilizeaza adapterul de obiecte");
        Masina masinaAdapter = new Masina("BMW", 1500);
        MasinaInchiriata masinaInchiriataCuAdapter = new MasinaInchiriata(masinaAdapter);
        PachetTuristic pachetMasinaInchiriata = new PachetMasinaInchiriataAdapter(masinaInchiriataCuAdapter);
        System.out.println();
        System.out.println("Se utilizeaza metoda de printare");
        printeazaRezervare(pachetMasinaInchiriata);

    }
}
