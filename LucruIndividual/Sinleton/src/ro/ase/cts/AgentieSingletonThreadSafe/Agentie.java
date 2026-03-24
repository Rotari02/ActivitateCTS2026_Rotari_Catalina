package ro.ase.cts.AgentieSingletonThreadSafe;

public class Agentie {
    private String nume;
    private String adresa;
    private int numarPacheteDisponibile;

    private static Agentie instanta = null; //instanta unica -lazy initialization

    //constructor privat
    private Agentie(String nume, String adresa, int numarPacheteDisponibile) {
        this.nume = nume;
        this.adresa = adresa;
        this.numarPacheteDisponibile = numarPacheteDisponibile;
    }

    //thread safe
    public static synchronized Agentie getInstanta(String nume, String adresa, int numarPacheteDisponibile) {
        if (instanta == null) {
            instanta = new Agentie(nume, adresa, numarPacheteDisponibile);
        }
        return instanta;
    }

    //metoda vindePachete
    public void vindePachet() {
        if (numarPacheteDisponibile > 0) {
            numarPacheteDisponibile--;
            System.out.println("Pachet vandut!");
        } else {
            System.out.println("Nu mai sunt pachete disponibile!");
        }
    }

    @Override
    public String toString() {
        return "AgentieLazy [nume="+ nume +
                " ,adresa=" + adresa +
                " ,nrPacheteDisponibile=" + numarPacheteDisponibile + "]";
    }
}